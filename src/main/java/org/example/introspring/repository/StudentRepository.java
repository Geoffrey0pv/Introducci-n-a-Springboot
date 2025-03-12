package org.example.introspring.repository;

import org.example.introspring.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findByProgram(String program);  // Query Method para listar estudiantes por programa

    Page<Student> findAll(Pageable pageable);
}
