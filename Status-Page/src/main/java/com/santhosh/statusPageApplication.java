package com.santhosh;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class statusPageApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(statusPageApplication.class, args);

	}

}
