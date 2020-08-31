
package com.santhosh.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="directtransaction")
public class Dtransaction {
	
	@Id
	private int sno;
	
	private String custid;
	
	private String sourceaccount;

	private String targetaccount;

	private String amountinr;
	private String transactionnumber;
	private String timestamp;
	private String email;
	
	public Dtransaction() {
		
	}
	
	
	
	
	public Dtransaction(String custid, String sourceaccount, String targetaccount, String amountinr,
			String transactionnumber, String timestamp, String email) {
		super();
		
		this.custid = custid;
		this.sourceaccount = sourceaccount;
		this.targetaccount = targetaccount;
		this.amountinr = amountinr;
		this.transactionnumber = transactionnumber;
		this.timestamp = timestamp;
		this.email = email;
	}




	public int getsNo() {
		return sno;
	}
	public void setsNo(int sno) {
		this.sno = sno;
	}
	public String getCustId() {
		return custid;
	}
	public void setCustId(String custid) {
		this.custid = custid;
	}
	public String getSourceAccount() {
		return sourceaccount;
	}
	public void setSourceAccount(String sourceaccount) {
		this.sourceaccount = sourceaccount;
	}
	public String getTargetAccount() {
		return targetaccount;
	}
	public void setTargetAccount(String targetaccount) {
		this.targetaccount = targetaccount;
	}
	public String getAmountINR() {
		return amountinr;
	}
	public void setAmountINR(String amountinr) {
		this.amountinr = amountinr;
	}
	
	
	public String getTransactionNumber() {
		return transactionnumber;
	}



	public void setTransactionNumber(String transactionnumber) {
		this.transactionnumber = transactionnumber;
	}
	


	public String getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Dtransaction [sno=" + sno + ", custid=" + custid + ", sourceaccount=" + sourceaccount
				+ ", targetaccount=" + targetaccount + ", amountinr=" + amountinr + ", transactionnumber="
				+ transactionnumber + ", timestamp=" + timestamp + ", email=" + email + "]";
	}
	
	
	

}
