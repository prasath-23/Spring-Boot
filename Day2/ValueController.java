package com.example.project1.Day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
	
	@Value("Hello ")
	private String greet;
	
	@Value("${name}")
	private String name;
	
	@GetMapping("/greet")
	public String greet()
	{
		return greet+name;
	}
	
}