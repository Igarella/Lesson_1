package com.company.services;

import com.company.DTO.Assessment;
import com.company.DTO.Student;

import java.util.List;
import java.util.UUID;

public interface StudentsService {

    List<Student> getAllStudents();

    void writeStudent(List<Student> studentList);

    void addStudent(Student student);

    void deleteStudent(UUID uuid);

    Student getStudentById(UUID id);

}



