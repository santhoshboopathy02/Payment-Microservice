package com.santhosh.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@RestController
@RequestMapping("/fallback")
public class gatewayController {
	
	
		
	@GetMapping("/message")
	public String test() {
		return "The requested Server is down"+"\n"+"Please Refresh the page";
	}
	
	
	
//	@RequestMapping(value="/home",method=RequestMethod.GET)
	
	
	

}


