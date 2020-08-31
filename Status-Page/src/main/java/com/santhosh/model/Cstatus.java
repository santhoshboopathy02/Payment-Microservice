
package com.santhosh.model;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="crosstransaction")
public class Cstatus {
	
	@Id
	private int sno;
	@NotNull(message="Customer ID cannot be empty")
	private String custid;
	@NotNull(message="Source Account cannot be empty")
	private String sourceaccount;
	@NotNull(message="Target Account cannot be empty")
	private String targetaccount;
	@NotNull(message="Amount Name cannot be empty")
	private String amountname;
	@NotNull(message="Amount cannot be empty")
	private String amount;
	private String amountinr;
	private String transactionnumber;
	private Timestamp timestamp;
	
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		
		this.sno = sno;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getSourceaccount() {
		return sourceaccount;
	}
	public void setSourceaccount(String sourceaccount) {
		this.sourceaccount = sourceaccount;
	}
	public String getTargetaccount() {
		return targetaccount;
	}
	public void setTargetaccount(String targetaccount) {
		this.targetaccount = targetaccount;
	}
	public String getAmountname() {
		return amountname;
	}
	public void setAmountname(String amountname) {
		this.amountname = amountname;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmountinr() {
		return amountinr;
	}
	public void setAmountinr(String amountinr) {
		this.amountinr = amountinr;
	}
	public String getTransactionnumber() {
		return transactionnumber;
	}
	public void setTransactionnumber(String transactionnumber) {
		this.transactionnumber = transactionnumber;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Cstatus [sno=" + sno + ", custid=" + custid + ", sourceaccount=" + sourceaccount + ", targetaccount="
				+ targetaccount + ", amountname=" + amountname + ", amount=" + amount + ", amountinr=" + amountinr
				+ ", transactionnumber=" + transactionnumber + ", timestamp=" + timestamp + "]";
	}
	

}
