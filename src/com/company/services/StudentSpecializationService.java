package com.company.services;

import com.company.DTO.Specialization;
import com.company.DTO.Student;
import com.company.DTO.StudentSpecialization;

import java.util.List;
import java.util.UUID;

public interface StudentSpecializationService {

    void addSpecializationStudent(StudentSpecialization studentSpecialization);

    List<StudentSpecialization> getAllStudentSpecializations();

    List<StudentSpecialization> getStudentSpecializationsById(UUID uuid);

}
