package com.company;

import com.company.DTO.*;
import com.company.services.*;
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
                    System.out.println("Введите день рождения");
                    String birthday = in.next();
                    Student student = new Student(name, secondName);
                    student.setBirthday(birthday);
                    StudentsService studentsService = new StudentsServiceIMPL();
                    studentsService.addStudent(student);
//                    studentsService.getAllStudents().forEach(System.out::println);
                }
                case 21 -> {
                    System.out.println("Введите id студента");
                    UUID studentId = UUID.fromString(in.next());
                    System.out.println("Введите id группы");
                    UUID groupId = UUID.fromString(in.next());
                    StudentGroup studentGroup = new StudentGroup(studentId, groupId);
                    StudentGroupService service = new StudentGroupServiceImpl();
                    service.addCurrentStudentToGroup(studentGroup);
                }
                case 22 -> {
                    GroupService service = new GroupServiceIMPL();
                    service.getAllGroups().forEach(System.out::println);
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
                    SubjectService service = new SubjectServiceIMPL();
                    service.getAllSubjects().forEach(System.out::println);
                }
                case 71 -> {
                    System.out.println("Введите id студента");
                    UUID studentIdForSpecialization = UUID.fromString(in.next());
                    System.out.println("Введите id предмета");
                    UUID specializationId = UUID.fromString(in.next());
                    StudentSpecializationService service = new StudentSpecializationServiceIMPL();
                    StudentSpecialization studentSpecialization =
                            new StudentSpecialization(studentIdForSpecialization, specializationId);
                    service.addSpecializationStudent(studentSpecialization);

                }
                    case 8 -> {
                    System.out.println("Введите название предмета");
                    String specializationName = in.next();
                    Subject subject = new Subject(specializationName);
                    SubjectService service = new SubjectServiceIMPL();
                    service.addSubject(subject);
                }
                case 81 -> {
                    System.out.println("Введите id студента");
                    UUID studentIdForAssessment = UUID.fromString(in.next());
                    System.out.println("Введите id предмета");
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
                    System.out.println("Введите id предмета");
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
                    System.out.println("Введите id предмета");
                    UUID subjectId = UUID.fromString(in.next());
                    System.out.println("Введите название темы");
                    String topicName = in.next();
                    Topic topic = new Topic(topicName, subjectId);
                    TopicsOfSubjectService service = new TopicsOfSubjectIMPL();
                    service.addTopic(topic);
                    SubjectService subjectService = new SubjectServiceIMPL();
                    Subject subject = subjectService.getSubjectById(subjectId);
                    subject.setTopics(topic);
                }
//                case 91 -> {
//                    System.out.println("Введите id специализации");
//                    UUID specializationId = UUID.fromString(in.next());
//                    SubjectService service = new SubjectServiceIMPL();
//                    Subject specialization = service.getSpecializationById(specializationId);
//                    specialization.getTopics();
//                }
                case 92 -> {
                    System.out.println("Введите id предмета");
                    UUID specializationId = UUID.fromString(in.next());
                    TopicsOfSubjectService service = new TopicsOfSubjectIMPL();
                    service.getTopicsBySpecializationSubjectId(specializationId).forEach(System.out::println);
                }
                case 10 ->{
                    System.out.println("Введите id студента");
                    UUID studentId = UUID.fromString(in.next());
                    System.out.println("Введите id факультета");
                    UUID facultyId = UUID.fromString(in.next());
                    System.out.println("Введите id группы");
                    UUID groupId = UUID.fromString(in.next());
                    System.out.println("Введите id специализации");
                    UUID specializationId = UUID.fromString(in.next());
                    ComplexId complexId = new ComplexId(studentId, facultyId, groupId, specializationId);
                    ComplexStudentService service = new ComplexStudentServiceImpl();
                    service.addComplexId(complexId);
                }
                case 101 -> {
                    ComplexStudentService service = new ComplexStudentServiceImpl();
                    service.getAllComplexStudents().forEach(System.out::println);
                }
                case 111 -> {
                    FacultyService service = new FacultyServiceIMPL();
                    service.getAllFaculties().forEach(System.out::println);
                }
                case 113 -> {
                    System.out.println("Введите название специализации");
                    String specializationName = in.next();
                    Specialization specialization = new Specialization(specializationName);
                    SpecializationService service = new SpecializationServiceIMPL();
                    service.addSpecialization(specialization);
                }
                case 0 -> MenuProgram.menuProgram();
                default -> System.out.println("Введите правильный номер");
            }
        } while (menu != 90);
    }
}
