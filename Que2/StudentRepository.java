package com.example.springassignStudents.repository;

import com.example.springassignStudents.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Autowired
    StudentRepository stdRepo = null;
}
