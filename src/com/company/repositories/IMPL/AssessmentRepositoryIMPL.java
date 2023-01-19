package com.company.repositories.IMPL;

import com.company.DTO.AssessmentSpecialization;
import com.company.repositories.AssessmentRepository;

import java.io.FileWriter;
import java.io.IOException;


public class AssessmentRepositoryIMPL implements AssessmentRepository {

    @Override
    public void addAssessment(AssessmentSpecialization assessmentSpecialization) {


//        try {
//            FileWriter writer = new FileWriter("resources/AssessmentsSpecializations.txt",true);
//            writer.write(assessmentSpecialization.getId() + "," + assessmentSpecialization.getStudentId()
//                    + "," + assessmentSpecialization.getSpecialization() + "," + assessmentSpecialization.getMark() + "\n");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
