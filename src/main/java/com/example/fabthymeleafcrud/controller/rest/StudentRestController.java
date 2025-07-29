package com.example.fabthymeleafcrud.controller.rest;

import com.example.fabthymeleafcrud.dto.StudentDTO;
import com.example.fabthymeleafcrud.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class StudentRestController {

    private final StudentService service;

    @GetMapping("/getStudentDetailsById/{id}")
    public ResponseEntity<Object> getStudentDetailsById(@PathVariable Long id) {
        return service.getStudentDetailsById(id);
    }
}
