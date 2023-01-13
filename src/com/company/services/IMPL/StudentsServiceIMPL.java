package com.company.services.IMPL;

import com.company.DTO.Student;
import com.company.repositories.IMPL.StudentsRepositoryIMPL;
import com.company.repositories.StudentsRepository;
import com.company.services.StudentsService;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class StudentsServiceIMPL implements StudentsService {
    @Override
    public List<Student> getAllStudents() {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        return repository.getAllStudents();
    }

    @Override
    public void addStudent(Student student) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        repository.addStudent(student);
    }

    @Override
    public void deleteStudent(UUID uuid) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        try {
            repository.deleteStudent(uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
