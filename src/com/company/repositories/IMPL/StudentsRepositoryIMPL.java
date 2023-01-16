package com.company.repositories.IMPL;

import com.company.DTO.Student;
import com.company.repositories.StudentsRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentsRepositoryIMPL implements StudentsRepository {

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        try {

            File file = new File("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] studentFromFile = line.split(",");
                Student student = new Student(UUID.fromString(studentFromFile[0]), studentFromFile[1], studentFromFile[2]);
                studentList.add(student);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }


    @Override
    public void writeStudent(List<Student> students) {

    }

    @Override
    public void addStudent(Student student) {
        try {
            FileWriter writer = new FileWriter("resources/Students.txt",true);
                writer.write(student.getId() + "," + student.getFirstName() + "," + student.getSecondName() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(UUID uuid) {
    }

    @Override
    public Student getStudentById(UUID id) {
        return getAllStudents()
                .stream()
                .filter(e-> e.getId().equals(id))
                .findFirst()
                .get();
    }


}


//TODO хранение в файле students.txt (чтение)