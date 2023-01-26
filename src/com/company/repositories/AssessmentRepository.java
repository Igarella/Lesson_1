package com.company.repositories;

import com.company.DTO.Assessment;

import java.util.List;
import java.util.UUID;

public interface AssessmentRepository {

    void addAssessment(Assessment assessment);

    List<Assessment> getAssessmentsOfTopic(UUID studentSubjectId, UUID topicId);

    List<Assessment> getAssessmentsOfSubjectStudent(UUID studentSubjectId);

    List<Assessment> getAllAssessments();

    Assessment getAssessmentById(UUID assessmentId);
}
