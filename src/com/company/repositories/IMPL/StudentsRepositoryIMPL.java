package com.company.repositories.IMPL;

import com.company.DTO.Student;
import com.company.repositories.StudentsRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class StudentsRepositoryIMPL implements StudentsRepository {
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(UUID.randomUUID(), "Alex", "Vasilev", new Date(1995, 10, 1));
        Student student2 = new Student(UUID.randomUUID(), "Oleg", "Petrov", new Date(1996, 11, 3));
        Student student3 = new Student(UUID.randomUUID(), "Sasha", "Ivanov", new Date(1990, 8, 9));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        return students;
    }
}


//TODO хранение в файле students.txt (чтение)