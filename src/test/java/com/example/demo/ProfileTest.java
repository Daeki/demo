package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProfileTest {
	
	@Value("${name}")
	private String name;

	@Test
	void test() {
		System.out.println(name);
	}

}
