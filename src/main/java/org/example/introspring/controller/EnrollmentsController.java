package org.example.introspring.controller;

import org.example.introspring.service.EnrollmentsService;
import org.example.introspring.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentsController {

    @Autowired
    private EnrollmentsService enrollmentsService;
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @PostMapping("/enroll")
    public String enrollStudent(@RequestParam long studentId, @RequestParam long courseId) {
        enrollmentsService.enrollStudent(studentId, courseId);
        return "Student enrolled successfully!";
    }

    @GetMapping()
    public String test(){
        enrollmentsService.enrollStudent(3,3);
        return "done";
    }
}
