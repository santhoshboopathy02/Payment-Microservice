package com.santhosh.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santhosh.models.GeneratedToken;


@Repository
public interface JwtRepo extends JpaRepository<GeneratedToken, Integer>{

	GeneratedToken findByUsername(String username);

}
