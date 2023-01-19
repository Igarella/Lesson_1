package com.company.services.IMPL;

import com.company.DTO.AssessmentSpecialization;
import com.company.repositories.AssessmentRepository;
import com.company.repositories.IMPL.AssessmentRepositoryIMPL;
import com.company.services.AssessmentService;

import java.util.UUID;

public class AssessmentServiceIMPL implements AssessmentService {

    @Override
    public void addAssessment(AssessmentSpecialization assessmentSpecialization) {
        AssessmentRepository repository = new AssessmentRepositoryIMPL();
        repository.addAssessment(assessmentSpecialization);
    }
}
