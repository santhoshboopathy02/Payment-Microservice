package com.eureka.zuul.security;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.eureka.zuul.repo.JwtRepo;
import com.eureka.zuul.security.GeneratedToken;
//import com.eureka.auth.security.GeneratedToken;
import com.eureka.common.security.JwtConfig;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JwtTokenAuthenticationFilter extends  OncePerRequestFilter {
    
	@Autowired
	public final JwtConfig jwtConfig;
	
	private final JwtRepo jwtRepo;

	public JwtTokenAuthenticationFilter(JwtConfig jwtConfig,JwtRepo jwtRepo) {
		this.jwtConfig = jwtConfig;
		this.jwtRepo=jwtRepo;
		
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
			
		GeneratedToken gt=jwtRepo.findByUsername("admin");
		String token1=gt.getGeneratedtoken();
		
		
		//validate the Token and check the prefix
		if(token1 == null || !token1.startsWith(jwtConfig.getPrefix())) {
			chain.doFilter(request, response);  		// If not valid, go to the next filter.
			return;
		}
		
		
		//Get the token
		String token=token1.replace(jwtConfig.getPrefix(), "");
		
		try {	
			//Validate the token
			Claims claims = Jwts.parser()
					.setSigningKey(jwtConfig.getSecret().getBytes())
					.parseClaimsJws(token)
					.getBody();
			
			String username = claims.getSubject();
			if(username != null) {
				@SuppressWarnings("unchecked")
				List<String> authorities = (List<String>) claims.get("authorities");
				
				//Create auth object
				 UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
								 username, null, authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
				 
				 //Authenticate the user
				 SecurityContextHolder.getContext().setAuthentication(auth);
			}
			
		} catch (Exception e) {
			// In case of failure, user won't be authenticated
			SecurityContextHolder.clearContext();
		}
		
		chain.doFilter(request, response);
	}

}