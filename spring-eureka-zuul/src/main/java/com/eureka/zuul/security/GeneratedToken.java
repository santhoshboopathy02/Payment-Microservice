package com.eureka.zuul.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class GeneratedToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	
	private String username;
	
	private String generatedtoken;
	
	public int getsno() {
		return sno;
	}

	public void setsNo(int sno) {
		this.sno = sno;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getGeneratedtoken() {
		return generatedtoken;
	}

	public void setGeneratedtoken(String generatedtoken) {
		this.generatedtoken = generatedtoken;
	}

	@Override
	public String toString() {
		return "GeneratedToken [sno=" + sno + ", username=" + username + ", generatedtoken=" + generatedtoken + "]";
	}

}
