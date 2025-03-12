package org.example.introspring.service;

import org.example.introspring.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    void createStudent(Student student);
    List<Student> getAllStudents();

    List<Student> getStudentsByProgram(String program);

    Page<Student> findAll(int page);
}

