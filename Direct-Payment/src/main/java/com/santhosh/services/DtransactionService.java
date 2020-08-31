package com.santhosh.services;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.santhosh.model.Dtransaction;
import com.santhosh.repository.DtransactionRepository;

@Service
@Transactional
public class DtransactionService {

	private final DtransactionRepository DtRepo;
	
	@Autowired
	public JavaMailSenderImpl javaMailSenderImpl;
	
	public DtransactionService(DtransactionRepository DtRepo) {
		this.DtRepo=DtRepo;
	}
	
	//for saving data in database
	public void saveMyData(Dtransaction dtransaction) {
		
		DtRepo.save(dtransaction);
	
	}
	
	//for generating transactionnumber
	public String getTransactionNumber() {

		Random rand = new Random();
		int tNum=rand.nextInt(1000000000);
		String temp=Integer.toString(tNum);
		return temp;
		
	}
	
	//for generating timeStamp
	public String getTimeStamp() {
		
		Date date = new Date();
		Timestamp timestamp=new Timestamp(date.getTime());
		String time=timestamp.toString();
		return time;
	}
	
	//for sending E-mail acknowledgement
	public void sendMail(String transactionnumber,String t,String targetaccount,String amount) {
		SimpleMailMessage msg=new SimpleMailMessage();
		Dtransaction dTransaction=DtRepo.findByTransactionnumber(transactionnumber);
		msg.setTo(dTransaction.getEmail());
		msg.setSubject("Payment-Acknowledgement");
		msg.setText("Your Transaction is Successful"+"\n"+
				"Rupees"+amount+" is sent to Account "+targetaccount+"\n"+
				"Your transaction Number is "+transactionnumber+"\n"+
				"Date & Time is "+t+"\n");

		javaMailSenderImpl.send(msg);
		
		
		
	}
}
