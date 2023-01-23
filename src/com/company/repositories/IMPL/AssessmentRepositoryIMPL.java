package com.company.repositories.IMPL;

import com.company.DTO.Assessment;
import com.company.repositories.AssessmentRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


public class AssessmentRepositoryIMPL implements AssessmentRepository {

    @Override
    public void addAssessment(Assessment assessment) {
        try {
            FileWriter writer = new FileWriter("resources/Assessments.txt",true);
            writer.write(assessment.getId() + "," + assessment.getStudentSpecializationId()
                    + "," + assessment.getMark() + "," + assessment.getTopicId()  + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Assessment> getAssessmentsOfTopic(UUID studentSpecializationId, UUID topicId) {
        return getAllAssessments()
                .stream()
                .filter(e -> e.getStudentSpecializationId().equals(studentSpecializationId) && e.getTopicId().equals(topicId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Assessment> getAssessmentsOfSpecializationStudent(UUID studentSpecializationId) {
        return getAllAssessments()
                .stream()
                .filter(e -> e.getStudentSpecializationId().equals(studentSpecializationId))
                .collect(Collectors.toList());
    }

    @Override
    public List<Assessment> getAllAssessments() {
        List<Assessment> assessmentList = new ArrayList<>();
        try {
            File file = new File("resources/Assessments.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] assessmentFields = line.split(",");
                Assessment assessment = new Assessment(UUID.fromString(assessmentFields[0])
                        , UUID.fromString(assessmentFields[1])
                        , Integer.parseInt(assessmentFields[2])
                        , UUID.fromString(assessmentFields[3]));
                // считываем остальные строки в цикле
                assessmentList.add(assessment);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return assessmentList;
    }
}
