package com.company.services;

import com.company.DTO.Assessment;
import com.company.DTO.AssessmentSpecialization;
import com.company.DTO.Student;

import java.util.List;
import java.util.UUID;

public interface AssessmentService {

    void addAssessment(Assessment assessment);

    List<Assessment> getAssessmentsOfTopic(UUID studentId, UUID topicId);
}
