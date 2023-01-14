package com.company.repositories;

import com.company.DTO.Phone;
import com.company.DTO.Student;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public interface StudentsRepository {

    List<Student> getAllStudents();

    void writeStudent(List<Student> list);

    void addStudent(Student student);

    void deleteStudent(UUID uuid) throws IOException;

}
