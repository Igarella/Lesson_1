package com.company.services.IMPL;

import com.company.DTO.StudentSpecialization;
import com.company.repositories.IMPL.StudentSpecializationRepositoryIMPL;
import com.company.repositories.StudentSpecializationRepository;
import com.company.services.StudentSpecializationService;

import java.util.List;
import java.util.UUID;

public class StudentSpecializationServiceIMPL implements StudentSpecializationService {

    @Override
    public void addSpecializationStudent(StudentSpecialization studentSpecialization) {
        StudentSpecializationRepository repository = new StudentSpecializationRepositoryIMPL();
        repository.addSpecializationStudent(studentSpecialization);
    }

    @Override
    public List<StudentSpecialization> getAllStudentSpecializations() {
        return null;
    }

    @Override
    public List<StudentSpecialization> getStudentSpecializationsById(UUID uuid) {
        return null;
    }
}
