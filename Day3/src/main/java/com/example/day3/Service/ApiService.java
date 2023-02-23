package com.example.day3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.Model.Employee;
import com.example.day3.Repository.EmployeeRepo;

@Service
public class ApiService {
    @Autowired
    EmployeeRepo repo ;
    
    public Employee addUser( Employee e )
    {
        return repo.save( e ) ;
    }

    public List<Employee> findValue()
    {
        return repo.findAll() ;
    }

}
