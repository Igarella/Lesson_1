package com.company.repositories;

import com.company.DTO.Specialization;

import java.util.List;

public interface SpecializationRepository {
    void addSpecialization(Specialization specialization);

    List<Specialization> getAllSpecializations();
}
