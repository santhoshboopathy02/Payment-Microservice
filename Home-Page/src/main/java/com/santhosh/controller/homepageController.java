package com.santhosh.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.santhosh.Repo.JwtRepo;
import com.santhosh.services.LogoutService;

@Controller
@RequestMapping("/")
public class homepageController {
	
	@Autowired
	JwtRepo jwtRepo;
	
	@Autowired
	private LogoutService logoutService;
	
	public homepageController(JwtRepo jwtRepo) {
		this.jwtRepo=jwtRepo;
	}
	
	//user login Page
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//for logging out
	@RequestMapping("/logout")
	public String logout() {
		
		logoutService.doLogout();
		return "login";
	}
	
	//displays the homepage
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String test1() {
		return "HomePage";
	}
	

}