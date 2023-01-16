package com.company.repositories.IMPL;

import com.company.DTO.Phone;
import com.company.DTO.StudentSpecialization;
import com.company.repositories.StudentSpecializationRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<StudentSpecialization> getStudentSpecializationByStudentId(UUID studentId) {
        List<StudentSpecialization> studentSpecializationList = new ArrayList<>();
        try {
            File file = new File("resources/SdudentSpecializations.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] studentSpecializationsFields = line.split(",");
                StudentSpecialization studentSpecialization = new StudentSpecialization(UUID.fromString(studentSpecializationsFields[0]),
                        UUID.fromString(studentSpecializationsFields[1]), UUID.fromString(studentSpecializationsFields[2]));
                studentSpecializationList.add(studentSpecialization);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentSpecializationList;
    }


}
