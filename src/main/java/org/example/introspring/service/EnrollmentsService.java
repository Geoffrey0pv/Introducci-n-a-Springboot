package org.example.introspring.service;

import jakarta.transaction.Transactional;
import org.example.introspring.entity.Course;
import org.example.introspring.entity.Enrollment;
import org.example.introspring.entity.Student;
import org.example.introspring.repository.CourseRepository;
import org.example.introspring.repository.EnrollmentRepository;
import org.example.introspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnrollmentsService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;


    @Transactional
    public void enrollStudent(long studentId, long courseId) {
        Student student = studentRepository.findById((int) studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        Course course = courseRepository.findById((int) courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        enrollmentRepository.save(enrollment);

    }

    public void EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Course> getCoursesByStudentId(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId)
                .stream()
                .map(Enrollment::getCourse)  // Extrae solo los cursos de las inscripciones
                .collect(Collectors.toList());
    }

}
