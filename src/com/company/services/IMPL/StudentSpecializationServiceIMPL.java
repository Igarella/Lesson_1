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
        StudentSpecializationRepository specializationRepository = new StudentSpecializationRepositoryIMPL();
        specializationRepository.getAllStudentSpecializations();
        return specializationRepository.getAllStudentSpecializations();
    }

    @Override
    public StudentSpecialization getStudentSpecializationsById(UUID studentId, UUID specializationId) {
        StudentSpecializationRepository repository = new StudentSpecializationRepositoryIMPL();
        return repository.getStudentSpecializationById(studentId, specializationId);
    }
}
