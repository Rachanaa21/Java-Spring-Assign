package com.example.springassignStudents.controller;

import com.example.springassignStudents.entity.Student;
import com.example.springassignStudents.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService stdservice;

    @PostMapping("/students")
    public ResponseEntity<Student> save(@RequestBody Student std) {
        return ResponseEntity.ok().body(this.stdservice.save(std));
    }


    @GetMapping("/getstudent/{id}")
    public Optional<Student> getStdbyID(@PathVariable("id") Long id)
    {
        return  this.stdservice.getStdData(id);
    }

    @GetMapping("/getAll")
    public List<Student> getAll() { return this.stdservice.getAll(); }

    @PutMapping("/updatestd/{id}")
    public Student updatestd(@PathVariable("id") Long id, @RequestBody Student student)
    {
        return this.stdservice.updatestd(id, student);
    }

    @DeleteMapping("/deletebyID/{id}")
    public String deletebyID(@PathVariable("id") Long id)
    {
        return this.stdservice.deletebyID(id);
    }
}
