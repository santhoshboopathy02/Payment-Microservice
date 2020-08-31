package com.santhosh.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.stereotype.Controller;

@Configuration
public class gatewayConfig {
	
	 @Bean
	    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	                .route(r -> r.path("/direct/**")
	                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
	                				.setFallbackUri("forward:/fallback/message")))
	                        .uri("lb://Direct-Payment")
	                        .id("directModule"))

	                .route(r -> r.path("/cross/**")
	                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
	                				.setFallbackUri("forward:/fallback/message")))
	                        .uri("lb://Cross-Border-service")
	                        .id("crossModule"))
	                
	                .route(r -> r.path("/homepage/**")
	                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
	                				.setFallbackUri("forward:/fallback/message")))
	                        .uri("lb://HOMEPAGE-SERVICE")
	                        .id("homePage"))
	                
	                .route(r -> r.path("/statuspage/**")
	                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
	                				.setFallbackUri("forward:/fallback/message")))
	                        .uri("lb://STATUS-SERVICE")
	                        .id("statusPage"))
	                
	                .route(r -> r.path("/auth/**")
	                		.filters(f -> f.hystrix(h -> h.setName("Hystrix")
	                				.setFallbackUri("forward:/fallback/message")))
	                        .uri("lb://AUTH-SERVICE")
	                        .id("authModule"))
	               
	                .build();
	    }
	 
	 
	
}
