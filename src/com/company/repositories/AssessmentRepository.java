package com.company.repositories;

import com.company.DTO.Assessment;

import java.util.List;
import java.util.UUID;

public interface AssessmentRepository {

    void addAssessment(Assessment assessment);

    List<Assessment> getAssessmentsOfTopic(UUID studentSpecializationId, UUID topicId);

    List<Assessment> getAssessmentsOfSpecializationStudent(UUID studentSpecializationId);

    List<Assessment> getAllAssessments();

}
