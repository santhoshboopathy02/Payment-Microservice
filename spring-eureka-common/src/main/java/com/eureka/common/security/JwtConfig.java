package com.eureka.common.security;

import org.springframework.beans.factory.annotation.Value;
import lombok.Getter;
import lombok.ToString;

	
 @Getter		// lombok will create getters auto.
 @ToString		// [IMP] You need to install lombok jar file: https://stackoverflow.com/a/11807022
 public class JwtConfig {

	@Value("${security.jwt.uri:/auth/**}")
    private String Uri;

    private static String generatedToken;

	@Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{24*60*60}}")
    private int expiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;
    
    
    
	public String getUri() {
		return Uri;
	}



	public String getHeader() {
		return header;
	}

	public String getPrefix() {
		return prefix;
	}

	public int getExpiration() {
		return expiration;
	}

	public String getSecret() {
		return secret;
	}
	
	public String getGeneratedToken() {
		return generatedToken;
	}

	public void setGeneratedToken(String generatedToken) {
		JwtConfig.generatedToken = generatedToken;
	}
    
}
