package com.company.repositories;

import com.company.DTO.Group;
import com.company.DTO.Specialization;
import com.company.services.SpecializationService;

import java.util.List;

public interface SpecializationRepository {

    List<Specialization> getAllSpecializations();

    void addSpecialization(Specialization specialization);
}
