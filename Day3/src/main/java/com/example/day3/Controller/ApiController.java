package com.example.day3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day3.Model.Employee;
import com.example.day3.Service.ApiService;

@RestController
public class ApiController {
    @Autowired
    ApiService service ;

    @PostMapping("/addvalue")
    public Employee addEmployee( @RequestBody Employee e )
    {
        return service.addUser(e) ;
    }

    @GetMapping("/showvalues")
    public List<Employee> showvalues()
    {
        return service.findValue() ;
    }
}
