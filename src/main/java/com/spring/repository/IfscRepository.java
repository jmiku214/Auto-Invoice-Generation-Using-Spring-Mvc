package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.Ifsc;

@Repository
public interface IfscRepository extends JpaRepository<Ifsc, Integer> {

	@Query("SELECT ifc,b from Ifsc ifc, Bank b where ifc.bank=b.id and b.bankName=?1")
	public List<Ifsc> findByBankNameLike(String bankName);
}
