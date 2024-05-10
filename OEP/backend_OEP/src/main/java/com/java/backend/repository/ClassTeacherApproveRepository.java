package com.java.backend.repository;

import com.java.backend.model.ClassTeacherApprove;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTeacherApproveRepository extends JpaRepository<ClassTeacherApprove, Long> {
    // Define custom query methods if needed
}