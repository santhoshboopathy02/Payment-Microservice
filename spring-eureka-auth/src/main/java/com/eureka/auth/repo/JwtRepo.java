package com.eureka.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.auth.security.GeneratedToken;



public interface JwtRepo extends JpaRepository<GeneratedToken, Integer>{

	GeneratedToken findByUsername(String username);

}
