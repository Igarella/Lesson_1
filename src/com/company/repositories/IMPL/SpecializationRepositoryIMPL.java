package com.company.repositories.IMPL;

import com.company.DTO.Group;
import com.company.DTO.Specialization;
import com.company.DTO.Specialization;
import com.company.repositories.SpecializationRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SpecializationRepositoryIMPL implements SpecializationRepository {
    
    @Override
    public List<Specialization> getAllSpecializations() {
        List<Specialization> specializationList = new ArrayList<>();
        try {
            File file = new File("resources/Specializations.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] specializationFields = line.split(",");
                Specialization specialization = new Specialization(UUID.fromString(specializationFields[0]), UUID.fromString(specializationFields[1]),
                        specializationFields[2]);
                specializationList.add(specialization);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return specializationList;
    }

    @Override
    public void addSpecialization(Specialization specialization) {
        try {
            FileWriter writer = new FileWriter("resources/Specializations.txt",true);
            writer.write(specialization.getSpecializationId() + "," + specialization.getGroupId() + "," + specialization.getFacultyId() + ","
                    + specialization.getSpecializationName() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
