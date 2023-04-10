package com.example.demo.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private String age;
	
	@Value("${email}")
	private String email;
	
	@Value("${phone}")
	private String phone;
	
	
	
	@GetMapping("/")
	public String home() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(phone);
		return "homeupdate";
	}

}
