package com.company.repositories;

import com.company.DTO.StudentSpecialization;

import java.util.List;
import java.util.UUID;

public interface StudentSpecializationRepository {
    void addSpecializationStudent(StudentSpecialization studentSpecialization);

    List<StudentSpecialization> getStudentSpecializationByStudentId(UUID studentId);


}
