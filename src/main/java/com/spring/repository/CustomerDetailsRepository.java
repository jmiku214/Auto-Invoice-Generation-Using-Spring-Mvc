package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.entity.CustomerDetails;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Long> {

	@Query("select c from CustomerDetails c where c.customerName LIKE %?1%")
	List<CustomerDetails> getCustomers(String name);
}
