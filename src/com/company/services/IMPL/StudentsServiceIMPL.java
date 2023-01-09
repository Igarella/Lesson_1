package com.company.services.IMPL;

import com.company.DTO.Student;
import com.company.repositories.IMPL.StudentsRepositoryIMPL;
import com.company.repositories.StudentsRepository;
import com.company.services.StudentsService;

import java.util.List;

public class StudentsServiceIMPL implements StudentsService {
    @Override
    public List<Student> getAllStudents() {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        return repository.getAllStudents();
    }
}
