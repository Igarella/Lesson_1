package com.company.repositories.IMPL;

import com.company.DTO.StudentSpecialization;
import com.company.repositories.StudentSpecializationRepository;

import java.io.FileWriter;
import java.io.IOException;

public class StudentSpecializationRepositoryIMPL implements StudentSpecializationRepository {
    @Override
    public void addSpecializationStudent(StudentSpecialization studentSpecialization) {
        try {
            FileWriter writer = new FileWriter("resources/StudentSpecializations.txt",true);
            writer.write(studentSpecialization.getId() + "," + studentSpecialization.getSpecialization()
                    + "," + studentSpecialization.getStudentId() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
