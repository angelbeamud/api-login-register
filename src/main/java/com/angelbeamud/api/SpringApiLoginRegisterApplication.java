package com.angelbeamud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringApiLoginRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiLoginRegisterApplication.class, args); 
	}

}
