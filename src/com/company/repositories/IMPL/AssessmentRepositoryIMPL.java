package com.company.repositories.IMPL;

import com.company.DTO.Assessment;
import com.company.repositories.AssessmentRepository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


public class AssessmentRepositoryIMPL implements AssessmentRepository {

    @Override
    public void addAssessment(Assessment assessment) {
        try {
            FileWriter writer = new FileWriter("resources/Assessments.txt",true);
            writer.write(assessment.getId() + "," + assessment.getStudentSpecializationId()
                    + "," + assessment.getMark() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Assessment> getAssessmentsOfTopic(UUID studentId, UUID topicId) {
        return null;
    }
}
