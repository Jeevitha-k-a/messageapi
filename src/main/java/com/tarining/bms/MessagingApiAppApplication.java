package com.tarining.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MessagingApiAppApplication {
	
	@GetMapping("greeting")
	public String printGreetings() {
		return "hii oracle";
	
	}
   
	public static void main(String[] args) {
		
		MessagingApiAppApplication m=new MessagingApiAppApplication();
		SpringApplication.run(MessagingApiAppApplication.class, args);
		
				m.printGreetings();
		
	}

}
