
package com.santhosh.model;

import java.sql.Timestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="directtransaction")
public class Dstatus {
	
	@Id
	private int sno;
	@NotNull(message="Customer ID cannot be empty")
	private String custid;
	@NotNull(message="Source Account cannot be empty")
	private String sourceaccount;
	@NotNull(message="Target Account cannot be empty")
	private String targetaccount;
	@NotNull(message="Amount cannot be empty")
	private String amountinr;
	private String transactionnumber;
	private Timestamp timestamp;
	

	@Override
	public String toString() {
		return "Dstatus [sno=" + sno + ", custid=" + custid + ", sourceaccount=" + sourceaccount + ", targetaccount="
				+ targetaccount + ", amountinr=" + amountinr + ", transactionnumber=" + transactionnumber
				+ ", timestamp=" + timestamp + "]";
	}
	
	

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

}
