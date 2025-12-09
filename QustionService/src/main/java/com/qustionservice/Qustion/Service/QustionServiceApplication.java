package com.qustionservice.Qustion.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QustionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QustionServiceApplication.class, args);
	}

}
