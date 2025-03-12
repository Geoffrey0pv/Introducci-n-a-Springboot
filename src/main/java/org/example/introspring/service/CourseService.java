package org.example.introspring.service;

import org.example.introspring.entity.Course;

import java.util.List;

public interface CourseService {


    void createCourse(Course course);

    List<Course> listCourseOfStudent(long studentId);
}
