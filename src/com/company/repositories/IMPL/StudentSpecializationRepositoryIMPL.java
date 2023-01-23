package com.company.repositories.IMPL;

import com.company.DTO.StudentSpecialization;
import com.company.repositories.StudentSpecializationRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class StudentSpecializationRepositoryIMPL implements StudentSpecializationRepository {
    @Override
    public void addSpecializationStudent(StudentSpecialization studentSpecialization) {
        try {
            FileWriter writer = new FileWriter("resources/StudentSpecializations.txt",true);
            writer.write(studentSpecialization.getId() + "," + studentSpecialization.getStudentId()
                    + "," + studentSpecialization.getSpecialization() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public StudentSpecialization getStudentSpecializationByStudentId(UUID studentId) {
        return getAllStudentSpecializations()
                .stream()
                .filter(e -> e.getStudentId().equals(studentId))
                .findFirst()
                .get();
    }

    @Override
    public List<StudentSpecialization> getAllStudentSpecializations() {
        List<StudentSpecialization> studentSpecializationList = new ArrayList<>();
        try {
            File file = new File("resources/StudentSpecializations.txt");
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

    @Override
    public StudentSpecialization getStudentSpecializationByStudentId(UUID studentId, UUID specializationId) {
        return getAllStudentSpecializations()
                .stream()
                .filter(e -> e.getStudentId().equals(studentId) && e.getSpecialization().equals(specializationId))
                .findFirst()
                .get();
    }


}
