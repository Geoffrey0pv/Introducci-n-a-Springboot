package org.example.introspring.controller;

import org.example.introspring.service.StudentService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.example.introspring.entity.Student;
import org.example.introspring.service.StudentServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    StudentController(@Qualifier("studentServiceImpl") StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/all/{page}")
    @ResponseBody
    public ResponseEntity<Page<Student>> getStudents() {
        var page = studentService.findAll(1);
        return ResponseEntity.status(200).body(page);
    }

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody Student Student){
        return "Estudiante creado";
    }

    @GetMapping("/program/{program}")
    public List<Student> getStudentsByProgram(@PathVariable String program) {
        List list = studentService.getStudentsByProgram("SIS");
        return ResponseEntity.status(200).body(list).getBody();
    }
}
