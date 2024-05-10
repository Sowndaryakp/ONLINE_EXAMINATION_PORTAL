package com.java.backend.controller;

import com.java.backend.model.ClassTeacherApprove;
import com.java.backend.service.ClassTeacherApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("class-teacher")
public class ClassTeacherApproveController {
    private final ClassTeacherApproveService classTeacherApproveService;

    @Autowired
    public ClassTeacherApproveController(ClassTeacherApproveService classTeacherApproveService) {
        this.classTeacherApproveService = classTeacherApproveService;
    }

    @PostMapping("/approve")
    public void approveStudentData(@RequestBody Long studentId) {
        classTeacherApproveService.approveStudentData(studentId);
    }
}
