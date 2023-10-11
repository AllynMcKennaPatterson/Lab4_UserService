package atu.cicd2.lab4_userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Lab4UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4UserServiceApplication.class, args);
	}

}
