package com.company.services.IMPL;

import com.company.DTO.Assessment;
import com.company.repositories.AssessmentRepository;
import com.company.repositories.IMPL.AssessmentRepositoryIMPL;
import com.company.services.AssessmentService;

import java.util.List;
import java.util.UUID;

public class AssessmentServiceIMPL implements AssessmentService {

    @Override
    public void addAssessment(Assessment assessment) {
        AssessmentRepository repository = new AssessmentRepositoryIMPL();
        repository.addAssessment(assessment);
    }

    @Override
    public List<Assessment> getAssessmentsOfTopic(UUID studentSpecializationId, UUID topicId) {
        AssessmentRepository repository = new AssessmentRepositoryIMPL();
        return repository.getAssessmentsOfTopic(studentSpecializationId, topicId);
    }

    @Override
    public List<Assessment> getAssessmentsOfSpecializationStudent(UUID studentSpecializationId) {
        AssessmentRepository repository = new AssessmentRepositoryIMPL();
        return repository.getAssessmentsOfSpecializationStudent(studentSpecializationId);
    }

    @Override
    public List<Assessment> getAllAssessments() {
        AssessmentRepository repository = new AssessmentRepositoryIMPL();
        return repository.getAllAssessments();
    }
}
