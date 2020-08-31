package com.santhosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santhosh.model.Cstatus;

public interface CStatusRepo extends JpaRepository<Cstatus, Integer> {
	
	Cstatus findByTransactionnumber(String transactionnumber);
	
}
