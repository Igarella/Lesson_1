package com.company.services;

import com.company.DTO.Group;
import com.company.DTO.Specialization;

import java.util.List;

public interface SpecializationService {
    List<Specialization> getAllSpecializations();

    void addSpecialization(Specialization specialization);
}
