package com.infy.insteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class InstepsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InstepsApplication.class, args);
	}

}
