package com.example.jpa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.jpa.Data.Student;
import com.example.jpa.Service.StudentService;

@RestController
public class ProjectController{
	
	@Autowired
	StudentService service;

	@PostMapping("/addValue")
	public boolean addUser(@RequestBody Student s) {
		return ( service.addUser(s) != null );
	}
	@GetMapping("/values")
	public List<Student> findValue()
	{
		return service.findValue();
	}
	@GetMapping("/testRun")
	public String test()
	{
		return service.testRun();
	}
	@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
	public Student updateValue( @RequestBody Student s , @PathVariable int id)
	{
		return service.updateValue( id , s) ;
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable int id )
	{
		return service.remove(id ) ;
	}
}
