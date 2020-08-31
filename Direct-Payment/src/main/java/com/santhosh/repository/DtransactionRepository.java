package com.santhosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.santhosh.model.Dtransaction;

public interface DtransactionRepository extends JpaRepository<Dtransaction, Integer> {
	
	
	Dtransaction findByTransactionnumber(String transactionnumber);
	
}