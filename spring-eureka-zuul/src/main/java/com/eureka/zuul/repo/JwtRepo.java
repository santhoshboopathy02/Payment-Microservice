package com.eureka.zuul.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eureka.zuul.security.GeneratedToken;

public interface JwtRepo extends JpaRepository<GeneratedToken, Integer> {

	GeneratedToken findByUsername(String username);
}
