package com.example.jpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.jpa.Data.Student;
import com.example.jpa.Repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo ;
    public Student addUser( Student student )
    {
        return repo.save(student) ;
    }
    // public Student getStudentById( int id )
    // {
    //     return repo.findById(id).orElse(null);
    // }
    public List<Student> findValue()
    {
        return repo.findAll() ;
    }
    public String testRun()
    {
        return "Succesful" ;
    }
    public Student updateValue( int id , Student s)
    {
        Student ex = repo.findById(id).orElse(null) ;
        ex.setRollNo(s.getRollNo());
        ex.setName(s.getName());
        ex.setMarks(s.getMarks());
        return repo.save(ex) ;
    }
    public boolean remove(int id)
    {
        // repo.findById(id).orElse(false)) 
        try
        {
            repo.deleteById(id) ;
        }
        catch(Exception e)
        {
            return false ; 
        }
        return true ;
    }
}
