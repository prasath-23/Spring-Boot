package com.example.day3.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "employee" )

public class Employee {
    @Id
    @GeneratedValue( )
    @Column( name = "ID" )
    private int id ;
    @Column( name = "EmployeeName" )
    private String employeeName ;
    @Column( name = "EmployeeAge" ) 
    private int employeeAge ;
    @Column( name = "Salary" )
    private long salary ;
    public void setId( int id )
    {
        this.id = id ;
    }
    public void setEmployeeName( String employeeName )
    {
        this.employeeName = employeeName ;
    }
    public void setEmploemployeeAge( int employeeAge )
    {
        this.employeeAge = employeeAge ;
    }
    public void setSalary( long salary)
    {
        this.salary = salary ;
    }
    public int getId()
    {
        return id ;
    }
    public String getEmployeeName()
    {
        return employeeName ;
    }
    public int getEmployeeAge()
    {
        return employeeAge ;
    }
    public long getSalary()
    {
        return salary ;
    }
    public Employee(){} ;
    public Employee( int id , String employeeName , int employeeAge , long salary  )
    {
        this.id = id ;
        this.employeeName = employeeName ;
        this.employeeAge = employeeAge ;
        this.salary = salary ;
    }
}
