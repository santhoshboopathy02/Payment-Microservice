package com.santhosh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrix
public class cloudGatewayserviceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(cloudGatewayserviceApplication.class, args);


	}

}
