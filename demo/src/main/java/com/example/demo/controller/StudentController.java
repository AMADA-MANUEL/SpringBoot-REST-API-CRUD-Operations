package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    //getll students


    @Autowired
    StudentRepository repo;
    //localhost:8080/students   gettting all  the students in the data base
    @GetMapping ("/students") //or url
    public List<Student> getAllStudebnts(){
        List<Student> students = repo.findAll(); //fetching all student detail
        return students ;



    }

}
