package com.company.services.IMPL;

import com.company.DTO.Specialization;
import com.company.repositories.IMPL.SpecializationRepositoryIMPL;
import com.company.repositories.SpecializationRepository;
import com.company.services.SpecializationService;

import java.util.List;
import java.util.UUID;

public class SpecializationServiceIMPL implements SpecializationService {
    @Override
    public List<Specialization> getAllSpecializations() {
        SpecializationRepository repository = new SpecializationRepositoryIMPL();
        return repository.getAllSpecializations();
    }

    @Override
    public void addSpecialization(Specialization specialization) {
        SpecializationRepository repository = new SpecializationRepositoryIMPL();
        repository.addSpecialization(specialization);
    }

    @Override
    public void deleteSpecialization(UUID uuid) {

    }
}
