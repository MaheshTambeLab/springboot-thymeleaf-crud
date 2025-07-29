package com.example.fabthymeleafcrud.service;

import com.example.fabthymeleafcrud.entity.Student;
import com.example.fabthymeleafcrud.mapper.StudentMapper;
import com.example.fabthymeleafcrud.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repo;

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

    @Override
    public ResponseEntity<Object> getStudentDetailsById(Long id) {
        Optional<Student> student = repo.findById(id);
        try {
            if (student.isPresent()) {
                return new ResponseEntity<>(StudentMapper.INSTANCE.mapStudentToStudentDTO(student.get()), HttpStatus.OK);
            }
        } catch (Exception ex) {
            log.error("Error occurred in searchStudentById >> {} {} ", ex, ex.getMessage());
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}

