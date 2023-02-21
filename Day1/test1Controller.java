package com.example.project1.Day1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test1Controller {

	@RequestMapping(value="/name/{name}",method=RequestMethod.GET)
	public String getName(@PathVariable String name)
	{
		return "hello "+name;
	}
}