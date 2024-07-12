package com.tarining.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingApiAppApplication {
	
	
	public void printGreetings() {
		System.out.println("hii oracle");
	
	}
   
	public static void main(String[] args) {
		
		MessagingApiAppApplication m=new MessagingApiAppApplication();
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
				m.printGreetings();
		
	}

}
