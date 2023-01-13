package com.company.repositories.IMPL;

import com.company.DTO.Student;
import com.company.repositories.StudentsRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StudentsRepositoryIMPL implements StudentsRepository {


    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
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
                students.add(student);
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void writeStudent(List<Student> students) {



    }

    @Override
    public void addStudent(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt"))) {
            oos.writeObject(student);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());


//        try {
//            FileWriter writer = new FileWriter("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt",true);
//                writer.write(student.getId() + "," + student.getFirstName() + "," + student.getSecondName() + "\n");
//            writer.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        }
    }

    @Override
    public void deleteStudent(UUID uuid) throws IOException {
        Path input = Paths.get("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt");
        Path temp = Files.createTempFile("temp", ".txt");
        Stream<String> lines = Files.lines(input);
        try (BufferedWriter writer = Files.newBufferedWriter(temp)) {
            lines
                    .filter(line -> !line.startsWith(uuid.toString()))
                    .forEach(line -> {
                        try {
                            writer.write(line);
                            writer.newLine();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        }

        Files.move(temp, input, StandardCopyOption.REPLACE_EXISTING);
    }


}


//TODO хранение в файле students.txt (чтение)