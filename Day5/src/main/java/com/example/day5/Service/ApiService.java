package com.example.day5.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.example.day5.Models.Book;
import com.example.day5.Repositories.BookRepo;

@Service
public class ApiService {
    @Autowired
    BookRepo repo ;

    public Book addBook( Book book )
    {
        return repo.save(book) ;
    }

    public List<Book> AllBook()
    {
        return repo.findAll() ;
    }
    public Optional<Book> findBookById( int id )
    {
        return repo.findById(id) ;
    }
    public String testRun()
    {
        return "Running" ;
    }
    public Book updateBook( Book b , int id )
    {
        Book ex = repo.findById(id).orElse(null) ;
        ex.setBookName(b.getBookName());
        ex.setPrice(b.getPrice());
        ex.setAuthorName(b.getAuthorName());
        ex.setQuantity(b.getQuantity());
        return repo.save(ex) ;
    }
    public String removeBook(int id)
    { 
        try
        {
            repo.deleteById(id) ;
        }
        catch(Exception e)
        {
            return "Failed To Delete" ; 
        }
        return "Data Removed" ;
    }
}