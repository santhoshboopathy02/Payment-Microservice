package com.santhosh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.santhosh.model.Dtransaction;
import com.santhosh.repository.DtransactionRepository;
import com.santhosh.services.DtransactionService;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.Valid;
@Controller
@RequestMapping("/")
public class DtransactionController {
	@Autowired
	private DtransactionService DtService;
	
	@Autowired
	DtransactionRepository DtRepo;
	
	//goes to Direct Payment Form
	@RequestMapping("/payment")
	public String processPayment() {
		return "DirectTransaction";
	}
	
    //save the Direct Payment details in DB
	@RequestMapping("/save-transaction")
	public ModelAndView savetransaction(@RequestParam String custid,@Valid @RequestParam String sourceaccount,@Valid @RequestParam String targetaccount,@Valid @RequestParam String amountinr, @RequestParam String email) {
	
		String transactionnumber=DtService.getTransactionNumber();
			
		String time=DtService.getTimeStamp();
		 
		Dtransaction dtransaction=new Dtransaction(custid,sourceaccount,targetaccount,amountinr,transactionnumber,time,email);
		DtService.saveMyData(dtransaction);
		
		DtService.sendMail(transactionnumber,time,targetaccount,amountinr);
		
		
		
		
		return new ModelAndView("Paid","transactionnumber",transactionnumber);
	}
	
	
}
