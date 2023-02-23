package com.example.jpa.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student2310")

public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column(name="ID")
    private int id;
	@Column(name="RollNo")
    private int rollNo;
    @Column(name="NAME")
    private String name;
    @Column(name="MARKS")
    private int marks;
    public Student(){};
    public void setRollNo(int rollNo) {
        this.rollNo=rollNo ;
    }
    public int getRollNo() {
    	return rollNo;
    }
    public void setID(int id) {
        this.id = id ;
    }
    public int getID() {
    	return id;
    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
    	return name;
    }
    public void setMarks(int marks) {
        this.marks=marks;
    }
    public int getMarks() {
    	return marks;
    }
    public Student(int rollNo,String name,int marks) {
    	super();
    	this.rollNo=rollNo;
    	this.name=name;
    	this.marks=marks;
    }
}