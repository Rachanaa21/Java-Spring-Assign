package com.example.springassignStudents.service;

import com.example.springassignStudents.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student save(Student student);

    public Optional<Student> getStdData(Long id);

    public List<Student> getAll();

    public Student updatestd(Long id, Student student);

    public String deletebyID(Long id);
}
