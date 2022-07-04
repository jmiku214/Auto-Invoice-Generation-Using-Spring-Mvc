package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.EmailRequest;

public interface EmailRequestRepository extends JpaRepository<EmailRequest, Integer> {

}
