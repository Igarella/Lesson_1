package com.company.services;

import com.company.DTO.StudentSpecialization;

import java.util.List;
import java.util.UUID;

public interface StudentSpecializationService {

    void addSpecializationStudent(StudentSpecialization studentSpecialization);

    List<StudentSpecialization> getAllStudentSpecializations();

    StudentSpecialization getStudentSpecializationsByStudentId(UUID studentId);

    StudentSpecialization getStudentSpecializationsByStudentAndSpecializationId(UUID studentId, UUID specializationId);




}
