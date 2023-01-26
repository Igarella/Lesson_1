package com.company.services;

import com.company.DTO.Group;
import com.company.DTO.Specialization;

import java.util.List;
import java.util.UUID;

public interface SpecializationService {
    List<Specialization> getAllSpecializations();

    void addSpecialization(Specialization specialization);

    Specialization getSpecializationById(UUID specializationId);
}
