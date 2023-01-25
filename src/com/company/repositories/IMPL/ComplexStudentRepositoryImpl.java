package com.company.repositories.IMPL;

import com.company.DTO.ComplexId;
import com.company.repositories.ComplexStudentRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ComplexStudentRepositoryImpl implements ComplexStudentRepository {
    @Override
    public List<ComplexId> getAllComplexStudents() {
        List<ComplexId> complexIdList = new ArrayList<>();
        try {
            File file = new File("resources/ComplexId.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] complexStudentFields = line.split(",");
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return complexIdList;
    }

    @Override
    public ComplexId getComplexIdByStudentId(UUID studentId) {
       return getAllComplexStudents()
                .stream()
                .filter(e -> e.getStudentId().equals(studentId))
                .findFirst()
                .get();
    }

    @Override
    public void addComplexId(ComplexId complexId) {
        try {
            FileWriter writer = new FileWriter("resources/ComplexId.txt",true);
            writer.write(complexId.getId() + "," + complexId.getStudentId() + "," + complexId.getFacultyId() + ","
                    + complexId.getGroupId() + "," + complexId.getSpecializationId() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
