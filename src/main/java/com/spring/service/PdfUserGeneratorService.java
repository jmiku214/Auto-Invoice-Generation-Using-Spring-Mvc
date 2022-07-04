package com.spring.service;

import java.io.FileOutputStream;
import java.util.List;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.spring.entity.CustomerDetails;
import com.spring.entity.Transaction;

@Service
public class PdfUserGeneratorService {

//	@Autowired
//	CustomerDetailsService customerService;
	
	@Autowired
	private TransactionService transactionService;

	public ResponseEntity<?> pdfGen(int transactionId, String path) throws Exception {

		Document document = new Document(PageSize.A4.rotate());

		String file_name = path;

		List<Transaction> list = transactionService.getTransaction();

		PdfWriter.getInstance(document, new FileOutputStream(file_name));

		document.open();

		System.out.println(document.isOpen());

		if (document.isOpen() == false) {
			document.open();
		}

		Font font = new Font(Font.HELVETICA, 14, Font.BOLDITALIC);

		Font font1 = new Font(Font.NORMAL, 12, Font.BOLDITALIC);

		PdfPTable table = new PdfPTable(9);

		table.setWidthPercentage(100);
		table.setWidths(new float[] { 12.0f, 13.0f, 13.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f });

		document.add(new Paragraph(
				"\n                                                                                                     "
						+ "INVOICE",
				font));


		
		PdfPCell cell = new PdfPCell();
		cell.setPhrase(new Phrase("INVOICE NO.", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("CUSTOMER NAME", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("CUSTOMER GST NO", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("PRODUCT NAME", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("PRODUCT HSN CODE", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("INVOICE DATE", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("TOTAL AMOUNT", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("AMOUNT PAID", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("AMOUNT PENDING", font));
		table.addCell(cell);

		
		

		
		for (Transaction transaction : list) {
			
			if (transaction.getId() == transactionId) {
				document.add(new Paragraph("\n\nHello Mr. " + transaction.getCustomerDetails().getCustomerName()
						+ ",\nThis is your updated invoice.\n\n", font1));

//				table.addCell(String.valueOf(transaction.getId()));
				table.addCell(transaction.getInvoiceNo());
				table.addCell(transaction.getCustomerDetails().getCustomerName());
				table.addCell(transaction.getCustomerDetails().getGstNumber());
				table.addCell(transaction.getProductDetails().getProductName());
				table.addCell(transaction.getProductDetails().getHsncode());
				table.addCell(String.valueOf(transaction.getInvoiceDate()));
				table.addCell(String.valueOf(transaction.getTotalAmount()));
				table.addCell(String.valueOf(transaction.getAmountPaid()));
				table.addCell(String.valueOf(transaction.getPendingAmount()));
				break;
				
			}

			// document.close();
		}

//		document.add(table);
		document.add(table);

		document.close();

		return ResponseEntity.ok().body("Pdf Is Generated");

	}

}
