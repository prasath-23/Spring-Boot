package com.example.project1.Day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
		
		@GetMapping("/hello")
		public String hello() {
			return "hello world";
		
	}

}
