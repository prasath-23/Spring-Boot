package com.example.jpa.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import com.example.jpa.Model.Student;
import com.example.jpa.Repository.StudentRepo;

@Service
public class ApiService {
    @Autowired
    StudentRepo repo ;
    public Student addUser( Student student )
    {
        return repo.save(student) ;
    }

    public List<Student> findValue()
    {
        return repo.findAll() ;
    }
    public Optional<Student> findValueById( int id )
    {
        return repo.findById(id) ;
    }
    public String testRun()
    {
        return "Succesful" ;
    }
    public Student updateValue( int id , Student s)
    {
        Student ex = repo.findById(id).orElse(null) ;
        ex.setStudName(s.getStudName());
        ex.setDeptName(s.getDeptName());
        ex.setMailId(s.getMailId());
        return repo.save(ex) ;
    }
    public boolean remove(int id)
    { 
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
