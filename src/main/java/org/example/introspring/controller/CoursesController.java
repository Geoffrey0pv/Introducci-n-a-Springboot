package org.example.introspring.controller;

import org.example.introspring.entity.Course;
import org.example.introspring.repository.CourseRepository;
import org.example.introspring.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CourseRepository courseRepository;
    private CourseService courseService;

    @PostMapping("/register")
    public Course registerCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity<List<Course>> create(){
        var list = courseService.listCourseOfStudent(1);
        return ResponseEntity.status(200).body(list);
    }
}
