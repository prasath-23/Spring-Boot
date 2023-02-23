package com.example.day3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day3.Model.Employee;

public interface EmployeeRepo extends JpaRepository< Employee ,Integer > {
    
}
