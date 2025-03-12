package org.example.introspring.service;

import org.example.introspring.entity.Course;
import org.example.introspring.repository.EnrollmentRepository;

import java.util.List;


public class CourseServiceImpl implements CourseService {

    private EnrollmentRepository enrollmentRepository;

    @Override
    public void createCourse(Course course){

    }

    @Override
    public List<Course> listCourseOfStudent(long studentId){
        var enrollments = enrollmentRepository.findByStudentId(studentId);
        return enrollments.stream().map(enrollment -> enrollment.getCourse()).toList();
    }
}
