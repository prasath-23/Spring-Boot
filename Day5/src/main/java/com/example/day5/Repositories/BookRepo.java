package com.example.day5.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5.Models.Book;

public interface BookRepo extends JpaRepository< Book , Integer>{
    
}
