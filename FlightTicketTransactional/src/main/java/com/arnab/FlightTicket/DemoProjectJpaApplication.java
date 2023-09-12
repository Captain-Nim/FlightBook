package com.arnab.FlightTicket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DemoProjectJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectJpaApplication.class, args);
	}

}
