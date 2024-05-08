package com.java.backend.controller;

import com.java.backend.model.Student;
import com.java.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.registerStudent(student);
    }

    @PostMapping("/login")
    public String loginStudent(@RequestBody Student student) {
        Student authenticatedStudent = studentService.loginStudent(student.getEmail(), student.getPassword());
        if (authenticatedStudent != null) {
            return "Login successful";
        } else {
            return "Invalid email or password";
        }
    }
}