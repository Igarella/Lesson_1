package com.company.repositories;

import com.company.DTO.Assessment;

import java.util.List;
import java.util.UUID;

public interface AssessmentRepository {

    void addAssessment(Assessment assessment);

    List<Assessment> getAssessmentsOfTopic(UUID studentId, UUID topicId);

}
