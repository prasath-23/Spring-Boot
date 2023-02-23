package com.example.day5.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "Books" )

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "ID" )
    private int id ;
    @Column(name = "BookName")
    private String bookName ;
    @Column(name = "price")
    private float price ;
    @Column(name = "Quantity")
    private int quantity ;
    @Column(name = "AuthorName")
    private String authorName ;
    public Book(){} ;
    public Book(int id , String bookName , float price , int quantity , String authorName)
    {
        super() ;
        this.id = id ;
        this.bookName = bookName ;
        this.price = price ;
        this.quantity = quantity ;
        this.authorName = authorName ;
    }
    public void setID( int id )
    {
        this.id = id ;
    }
    public int getID()
    {
        return id ;
    }
    public void setBookName( String bookName )
    {
        this.bookName = bookName ;
    }
    public String getBookName()
    {
        return bookName ;
    }
    public void setPrice( float price )
    {
        this.price = price ;
    }
    public float getPrice()
    {
        return price ;
    }
    public void setQuantity( int quantity )
    {
        this.quantity = quantity ;
    }
    public int getQuantity()
    {
        return quantity ;
    }
    public void setAuthorName( String authorName )
    {
        this.authorName = authorName ;
    }
    public String getAuthorName()
    {
        return authorName ;
    }

}
