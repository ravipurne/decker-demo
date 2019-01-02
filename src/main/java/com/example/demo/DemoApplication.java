package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	

	public static void main(String[] args) {
		System.setProperty("logging.level.org.apache.http", "DEBUG");
		System.out.println("Hey Guys, Happy New Year!!!");
		SpringApplication.run(DemoApplication.class, args);
	}
}
