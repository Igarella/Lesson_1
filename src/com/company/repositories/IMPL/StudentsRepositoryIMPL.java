package com.company.repositories.IMPL;

import com.company.DTO.Student;
import com.company.repositories.StudentsRepository;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class StudentsRepositoryIMPL implements StudentsRepository {
    public static void main(String[] args) {
        try(ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt",true))){
            Student student = new Student(UUID.randomUUID(), "Petya", "Ivanov");
            Student student1 = new Student(UUID.randomUUID(), "ivan", "Petrov");
            ois.writeObject(student);
            ois.close();
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt"));
//            while (inputStream.available() != -1) {
//                Student student3 = (Student) inputStream.readObject();
//                System.out.println(student3);
//
//            }
            Student student2 = (Student) inputStream.readObject();
            Student student3 = (Student) inputStream.readObject();
            System.out.println(student2);
            System.out.println(student3);
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt")))
        {
            while (true) {
                Student student=(Student) ois.readObject();
                students.add(student);
            }
        }
        catch(Exception ex){
            return students;
        }
//        try {
//            File file = new File("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt");
//            //создаем объект FileReader для объекта File
//            FileReader fr = new FileReader(file);
//            //создаем BufferedReader с существующего FileReader для построчного считывания
//            BufferedReader reader = new BufferedReader(fr);
//            // считаем сначала первую строку
//            String line = reader.readLine();
//            while (line != null) {
//                String[] studentFromFile = line.split(",");
//                Student student = new Student(UUID.fromString(studentFromFile[0]), studentFromFile[1], studentFromFile[2]);
//                students.add(student);
//                // считываем остальные строки в цикле
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void writeStudent(List<Student> students) {
    }

    @Override
    public void addStudent(Student student) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/igor/IdeaProjects/Lesson 1/resources/Students.txt",false))) {
            oos.writeObject(student);
            oos.writeObject(student);
            oos.reset();
        } catch (Exception ex) {
           ex.printStackTrace();


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