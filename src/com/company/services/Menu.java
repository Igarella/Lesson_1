package com.company.services;

import com.company.DTO.Email;
import com.company.DTO.Phone;
import com.company.DTO.Specialization;
import com.company.DTO.Student;
import com.company.services.IMPL.EmailServiceIMPL;
import com.company.services.IMPL.PhoneServiceIMPL;
import com.company.services.IMPL.SpecializationServiceIMPL;
import com.company.services.IMPL.StudentsServiceIMPL;

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
                case 8 -> {
                    System.out.println("Введите название специализации");
                    String specializationName = in.next();
                    Specialization specialization = new Specialization(specializationName);
                    SpecializationService service = new SpecializationServiceIMPL();
                    service.addSpecialization(specialization);
                }
                case 0 -> MenuProgram.menuProgram();
                default -> System.out.println("Введите правильный номер");
            }
        } while (menu != 9);
    }
}
