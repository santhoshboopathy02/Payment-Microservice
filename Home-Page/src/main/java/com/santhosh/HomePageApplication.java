package com.santhosh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class HomePageApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method
		SpringApplication.run(HomePageApplication.class, args);

		
		
	}

}
