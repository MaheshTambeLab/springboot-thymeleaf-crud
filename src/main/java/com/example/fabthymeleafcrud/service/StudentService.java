package com.example.fabthymeleafcrud.service;

import com.example.fabthymeleafcrud.entity.Student;
import com.example.fabthymeleafcrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void save(Student student) {
        repo.save(student);
    }

    public Student getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

}

