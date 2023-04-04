package com.example.demo.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${test}")
	private String msg;
	
	@GetMapping("/")
	public String home() {
		System.out.println(msg);
		return "homeupdate";
	}

}
