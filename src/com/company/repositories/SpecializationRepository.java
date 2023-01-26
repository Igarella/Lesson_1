package com.company.repositories;

import com.company.DTO.Group;
import com.company.DTO.Specialization;
import com.company.services.SpecializationService;

import java.util.List;
import java.util.UUID;

public interface SpecializationRepository {

    List<Specialization> getAllSpecializations();

    void addSpecialization(Specialization specialization);

    Specialization getSpecializationById(UUID specializationId);
}
