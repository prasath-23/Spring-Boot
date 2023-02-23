package com.example.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.Model.Student;

public interface StudentRepo extends JpaRepository< Student , Integer > {

} 