package com.example.day5.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.day5.Models.Book;
import com.example.day5.Service.ApiService;

@RestController
public class ApiController {
    @Autowired
    ApiService service ;

    @PostMapping( "/addbook" )
    public Book addBook( @RequestBody Book book )
    {
        return service.addBook(book) ;
    }

    @GetMapping( "/showbooks" )
    public List<Book> showBooks()
    {
        return service.AllBook() ;
    }

    @RequestMapping( value = "/showbook/{id}" , method = RequestMethod.GET)
    public Optional<Book> showBookById( @PathVariable int id)
    {
        return service.findBookById(id) ;
    }

    @RequestMapping( value = "/update/{id}" , method = RequestMethod.PUT) 
    public Book updateBook( @RequestBody Book book , @PathVariable int id )
    {
        return service.updateBook(book, id) ;
    }

    @RequestMapping( value = "/delete/{id}" , method = RequestMethod.DELETE)
    public String deleteBook( @PathVariable int id )
    {
        return service.removeBook(id) ;
    }

    @GetMapping("/testrun")
    public String TestRun()
    {
        return service.testRun() ;
    }
    
}
