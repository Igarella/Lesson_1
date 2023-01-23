package com.company.services;

import com.company.DTO.Assessment;

import java.util.List;
import java.util.UUID;

public interface AssessmentService {

    void addAssessment(Assessment assessment);

    List<Assessment> getAssessmentsOfTopic(UUID studentSpecializationId, UUID topicId);

    List<Assessment> getAssessmentsOfSpecializationStudent(UUID studentSpecializationId);

    List<Assessment> getAllAssessments();

}
