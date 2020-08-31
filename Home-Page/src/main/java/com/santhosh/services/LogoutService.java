package com.santhosh.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.santhosh.Repo.JwtRepo;
import com.santhosh.models.GeneratedToken;

@Service
@Transactional
public class LogoutService {

	private final JwtRepo jwtRepo;
	
	public LogoutService(JwtRepo jwtRepo) {
		this.jwtRepo=jwtRepo;
	}
	
	
	public void doLogout() {
		String value="TokenNotGenerated";
	
		GeneratedToken gt=jwtRepo.findByUsername("admin");
		gt.setGeneratedtoken(value);
		jwtRepo.saveAndFlush(gt);
		
	}
}
