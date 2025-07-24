package com.example.fabthymeleafcrud.repository;

import com.example.fabthymeleafcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

