package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.entity.AccountHolderDetails;

@Repository
public interface AccountHolderDetailsRepository extends JpaRepository<AccountHolderDetails, Integer> {

	@Query("SELECT a,b from AccountHolderDetails a, Bank b where a.bank=b.id and b.bankName=?1")
	List<AccountHolderDetails> findByBankName(String bankName);
}
