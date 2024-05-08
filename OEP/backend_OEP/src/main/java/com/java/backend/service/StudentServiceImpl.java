package com.java.backend.service;

import com.java.backend.model.Student;
import com.java.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private final StudentRepository studentRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, BCryptPasswordEncoder passwordEncoder) {
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public Student registerStudent(Student student) {
        // Set approval status to false by default
        student.setApproved(false);
        String hashedPassword = passwordEncoder.encode(student.getPassword());
        student.setPassword(hashedPassword);
        return studentRepository.save(student);
    }

    @Override
    public Student loginStudent(String email, String password) {
        return studentRepository.findByEmailAndPasswordAndApprovedIsTrue(email, password);
    }


}