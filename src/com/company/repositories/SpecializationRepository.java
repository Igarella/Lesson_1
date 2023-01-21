package com.company.repositories;

import com.company.DTO.Specialization;

import java.util.List;
import java.util.UUID;

public interface SpecializationRepository {
    void addSpecialization(Specialization specialization);

    List<Specialization> getAllSpecializations();

    String getNameById(UUID specializationId);

    Specialization getSpecializationById(UUID specializationId);
}
