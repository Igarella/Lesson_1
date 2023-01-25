package com.company.repositories.IMPL;

import com.company.DTO.BirthdayStudent;
import com.company.DTO.Email;
import com.company.repositories.BirthdayStudentRepository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BirthdayStudentRepositoryImpl implements BirthdayStudentRepository {

    @Override
    public String getBirthdayByStudentId(UUID studentId) {
        return null;
    }

    @Override
    public List<BirthdayStudent> getAllBirthdaysStudents() {
        List<BirthdayStudent> birthdayStudents = new ArrayList<>();
        try {
            File file = new File("resources/BirthdayStudents.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] birthdayStudentFields = line.split(",");
                BirthdayStudent birthdayStudent = new BirthdayStudent(UUID.fromString(birthdayStudentFields[0]), birthdayStudentFields[1]);
                birthdayStudents.add(birthdayStudent);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return birthdayStudents;
    }
}
