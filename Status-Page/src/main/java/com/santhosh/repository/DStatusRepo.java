package com.santhosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santhosh.model.Dstatus;

public interface DStatusRepo extends JpaRepository<Dstatus, Integer> {
	
	Dstatus findByTransactionnumber(String transactionnumber);
	
}
