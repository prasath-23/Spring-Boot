package com.example.jpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="ID")
    private int id;
    @Column(name="Stud_Name")
    private String Stud_Name;
	@Column(name="Dept_Name")
    private String Dept_Name;
    @Column(name="Mail_Id")
    private String mailId;
    public Student(){};
    public void setId(int id) {
        this.id = id ;
    }
    public int getId() {
    	return id;
    }
    public void setStudName(String Name) {
        this.Stud_Name = Name;
    }
    public String getStudName() {
    	return Stud_Name;
    }
    public void setDeptName(String name) {
        this.Dept_Name=name;
    }
    public String getDeptName() {
    	return Dept_Name ;
    }
    public void setMailId(String mailId) {
        this.mailId=mailId;
    }
    public String getMailId() {
    	return mailId;
    }
    public Student(int id,String Stud_Name, String Dept_Name , String mailId)
     {
    	super();
    	this.id = id ;
    	this.Stud_Name = Stud_Name;
    	this.Dept_Name = Dept_Name;
        this.mailId = mailId ;
    }
}