package com.company.services;

import com.company.DTO.Student;

import java.util.List;
import java.util.UUID;

public interface StudentsService {

    List<Student> getAllStudents();

    void addStudent(Student student);

    void deleteStudent(UUID uuid);
}


//TODO создать метод void addStudent(Student s)
//TODo создать метод void removeStudent(Student s)

