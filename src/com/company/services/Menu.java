package com.company.services;

import com.company.DTO.*;
import com.company.services.IMPL.*;

import java.util.Scanner;
import java.util.UUID;

public class Menu {
     public static void startMenu() {
        int menu;
        Scanner in = new Scanner(System.in);
        MenuProgram.menuProgram();
        do {
            menu = in.nextInt();
            switch (menu) {
                case 1 -> {
                    StudentsService studentsService = new StudentsServiceIMPL();
                    studentsService.getAllStudents().forEach(System.out::println);
                }
                case 11 -> {
                    StudentsService studentsService = new StudentsServiceIMPL();
                    studentsService.getDeletedStudents().forEach(System.out::println);
                }
                case 2 -> {
                    System.out.println("Введите имя студента");
                    String name = in.next();
                    System.out.println("Введите фамилию");
                    String secondName = in.next();
                    Student student = new Student(name, secondName);
                    StudentsService studentsService = new StudentsServiceIMPL();
                    studentsService.addStudent(student);
//                    studentsService.getAllStudents().forEach(System.out::println);
                }
                case 3 -> {
                    System.out.println("Введите id студента");
                    UUID uuid = UUID.fromString(in.next());
                    StudentsService studentsService = new StudentsServiceIMPL();
                    studentsService.deleteStudent(uuid);
                }
                case 4 -> {
                    System.out.println("Введите id студента");
                    UUID studentId = UUID.fromString(in.next());
                    System.out.println("Введите префикс страны");
                    int prefix = in.nextInt();
                    System.out.println("Введите телефон");
                    String phone = in.next();
                    System.out.println("Введите тип телефона (моб/дом)");
                    String typePhone = in.next();
                    Phone studentPhone = new Phone(prefix, phone, typePhone, studentId);
                    PhoneService service = new PhoneServiceIMPL();
                    service.addPhone(studentPhone);

                }
                case 5 -> {
                    System.out.println("Введите id студента");
                    UUID studentId = UUID.fromString(in.next());
                    StudentsService studentsService = new StudentsServiceIMPL();
                    System.out.println(studentsService.getStudentById(studentId));
                }
                case 6-> {
                    System.out.println("Введите id студента");
                    UUID studentIdForEmail = UUID.fromString(in.next());
                    System.out.println("Введите email");
                    String email = in.next();
                    Email studentEmail = new Email(email, studentIdForEmail);
                    EmailService service = new EmailServiceIMPL();
                    service.addEmail(studentEmail);
                }
                case 7 -> {
                    SpecializationService service = new SpecializationServiceIMPL();
                    service.getAllSpecializations().forEach(System.out::println);
                }
                case 71 -> {
                    System.out.println("Введите id студента");
                    UUID studentIdForSpecialization = UUID.fromString(in.next());
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    StudentSpecializationService service = new StudentSpecializationServiceIMPL();
                    StudentSpecialization studentSpecialization =
                            new StudentSpecialization(studentIdForSpecialization, specializationId);
                    service.addSpecializationStudent(studentSpecialization);

                }
                    case 8 -> {
                    System.out.println("Введите название специализации");
                    String specializationName = in.next();
                    Specialization specialization = new Specialization(specializationName);
                    SpecializationService service = new SpecializationServiceIMPL();
                    service.addSpecialization(specialization);
                }
                case 81 -> {
                    System.out.println("Введите id студента");
                    UUID studentIdForAssessment = UUID.fromString(in.next());
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    System.out.println("Введите id темы");
                    UUID topicId = UUID.fromString(in.next());
                    System.out.println("Введите оценку");
                    int mark = in.nextInt();
                    StudentSpecializationService service = new StudentSpecializationServiceIMPL();
                    StudentSpecialization studentSpecialization = service.getStudentSpecializationsByStudentId(studentIdForAssessment);
                    Assessment assessment = new Assessment(studentSpecialization.getId(), mark, topicId);
                    AssessmentService assessmentService = new AssessmentServiceIMPL();
                    assessmentService.addAssessment(assessment);
                }
                case 82 -> {
                    System.out.println("Введите id студента");
                    UUID studentIdForAssessment = UUID.fromString(in.next());
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    StudentSpecializationService service = new StudentSpecializationServiceIMPL();
                    StudentSpecialization studentSpecialization = service.getStudentSpecializationsByStudentAndSpecializationId(studentIdForAssessment,specializationId);
                    AssessmentService assessmentService = new AssessmentServiceIMPL();
                    assessmentService.getAssessmentsOfSpecializationStudent(studentSpecialization.getId())
                            .stream()
                            .map(Assessment::getMark)
                            .forEach(System.out::println);
                }
                case 9 -> {
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    System.out.println("Введите название темы");
                    String topicName = in.next();
                    Topic topic = new Topic(topicName, specializationId);
                    TopicsOfSpecializationService service = new TopicsOfSpecializationIMPL();
                    service.addTopic(topic);
                    SpecializationService specializationService = new SpecializationServiceIMPL();
                    Specialization specialization = specializationService.getSpecializationById(specializationId);
                    specialization.setTopics(topic);
                }
//                case 91 -> {
//                    System.out.println("Введите id специализации");
//                    UUID specializationId = UUID.fromString(in.next());
//                    SpecializationService service = new SpecializationServiceIMPL();
//                    Specialization specialization = service.getSpecializationById(specializationId);
//                    specialization.getTopics();
//                }
                case 92 -> {
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    TopicsOfSpecializationService service = new TopicsOfSpecializationIMPL();
                    service.getTopicsBySpecializationId(specializationId).forEach(System.out::println);
                }
                case 0 -> MenuProgram.menuProgram();
                default -> System.out.println("Введите правильный номер");
            }
        } while (menu != 90);
    }
}
