package com.company;

import com.company.DTO.Student;
import com.company.services.IMPL.StudentsServiceIMPL;
import com.company.services.StudentsService;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        startMenu();
    }

    private static void startMenu() {
        int menu;
        Scanner in = new Scanner(System.in);
        menuProgram();
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
                case 0 -> menuProgram();
                default -> System.out.println("Ввведите правильный номер");
            }
        } while (menu != 9);
    }

    private static void menuProgram() {
        System.out.println("Меню программы:");
        System.out.println("1 – Просмотр списка студентов");
        System.out.println("2 – Добавление студента");
        System.out.println("3 – Удаление студента");
        System.out.println("0 – Возврат в главное меню");
        System.out.println("9 – ВЫХОД ");
    }
}
