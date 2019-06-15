package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableAutoConfiguration
public class EhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheApplication.class, args);
	}

}
