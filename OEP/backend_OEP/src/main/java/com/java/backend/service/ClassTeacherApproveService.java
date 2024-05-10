package com.java.backend.service;

import com.java.backend.model.ClassTeacherApprove;
import com.java.backend.model.Student;
import com.java.backend.repository.ClassTeacherApproveRepository;
import com.java.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassTeacherApproveService {
    private final StudentRepository studentRepository;
    private final ClassTeacherApproveRepository classTeacherApproveRepository;

    // Constructor injection of repositories
    public ClassTeacherApproveService(StudentRepository studentRepository, ClassTeacherApproveRepository classTeacherApproveRepository) {
        this.studentRepository = studentRepository;
        this.classTeacherApproveRepository = classTeacherApproveRepository;
    }

    // Method to approve student data
    public void approveStudentData(Long studentId) {
        // Retrieve the Student object from the database
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        // Create a new ClassTeacherApprove instance with the retrieved Student
        ClassTeacherApprove classTeacherApprove = new ClassTeacherApprove();
        classTeacherApprove.setStudent(student);

        // Save the ClassTeacherApprove entity
        classTeacherApproveRepository.save(classTeacherApprove);
    }
}