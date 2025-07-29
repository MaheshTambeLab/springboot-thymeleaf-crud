package com.example.fabthymeleafcrud.service;

import com.example.fabthymeleafcrud.dto.StudentDTO;
import com.example.fabthymeleafcrud.entity.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    void save(Student student);

    Student getById(Long id);

    void delete(Long id);

    ResponseEntity<Object> getStudentDetailsById(Long id);
}
