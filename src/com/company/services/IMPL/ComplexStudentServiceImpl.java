package com.company.services.IMPL;

import com.company.DTO.ComplexId;
import com.company.repositories.ComplexStudentRepository;
import com.company.repositories.IMPL.ComplexStudentRepositoryImpl;
import com.company.services.ComplexStudentService;

import java.util.List;
import java.util.UUID;

public class ComplexStudentServiceImpl implements ComplexStudentService {
    @Override
    public List<ComplexId> getAllComplexStudents() {
        ComplexStudentRepository repository = new ComplexStudentRepositoryImpl();
        return repository.getAllComplexStudents();
    }

    @Override
    public ComplexId getComplexIdByStudentId(UUID studentId) {
        ComplexStudentRepository repository = new ComplexStudentRepositoryImpl();
        return repository.getComplexIdByStudentId(studentId);
    }

    @Override
    public void addComplexId(ComplexId complexId) {
        ComplexStudentRepository repository = new ComplexStudentRepositoryImpl();
        repository.addComplexId(complexId);
    }
}
