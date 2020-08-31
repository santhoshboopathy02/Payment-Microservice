package com.santhosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.santhosh.model.Cstatus;
import com.santhosh.model.Dstatus;
import com.santhosh.repository.DStatusRepo;
import com.santhosh.repository.CStatusRepo;

@Controller

public class statuscontroller {
	@Autowired
	DStatusRepo StRepo;
	@Autowired
	CStatusRepo CtRepo;
	
	//select the type of payment to be checked
	@RequestMapping("/status")
	public String statusType() {
		return "StatusType";
	}
	
	//if direct payment is selected
	@RequestMapping("/statustype")
		public String test1() {
			return "DStatusPageForm";
		}
	
	//search for transaction details in DB
	@RequestMapping("/statuscheck")
	public ModelAndView test(@RequestParam String custid, @RequestParam String transactionnumber)
	{		
		ModelAndView mv=new ModelAndView("StatusPage");
		Dstatus dstatus=StRepo.findByTransactionnumber(transactionnumber);
		mv.addObject(dstatus);
		return mv;
		
	}
	
	//if cross border payment is selected
	@RequestMapping("/status1type")
	public String cross() {
		return "CStatusPageForm";
	}
	
	//search for transaction details in DB
	@RequestMapping("/statusccheck")
	public ModelAndView getCtransaction(@RequestParam String custid, @RequestParam String transactionnumber)
	{
		ModelAndView mv1=new ModelAndView("StatusPage1");
		Cstatus cstatus=CtRepo.findByTransactionnumber(transactionnumber);
		mv1.addObject(cstatus);
		return mv1;
	}

}