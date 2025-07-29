package com.example.fabthymeleafcrud.mapper;

import com.example.fabthymeleafcrud.dto.StudentDTO;
import com.example.fabthymeleafcrud.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDTO mapStudentToStudentDTO(Student student);
}
