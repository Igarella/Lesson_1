package com.company.repositories;

import com.company.DTO.AssessmentSpecialization;

import java.util.UUID;

public interface AssessmentRepository {

    void addAssessment(AssessmentSpecialization assessmentSpecialization);
}
