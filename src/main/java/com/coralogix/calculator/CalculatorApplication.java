package com.coralogix.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
                int value = 0;
                value = value + 5;
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
