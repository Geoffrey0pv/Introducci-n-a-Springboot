package org.example.introspring.repository;

import org.example.introspring.entity.Course;
import org.example.introspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> findByStudent_Id(Student student);

}
