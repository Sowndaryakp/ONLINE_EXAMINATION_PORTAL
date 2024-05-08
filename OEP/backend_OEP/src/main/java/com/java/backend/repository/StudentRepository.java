package com.java.backend.repository;

import com.java.backend.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long> {
    Student findByEmailAndPasswordAndApprovedIsTrue(String email, String password);

    Student findByEmail(String email);
}