package com.company.DTO;

import java.util.UUID;

public class BirthdayStudent {
    private UUID birthdayStudentId;
    private String birthdayStudent;

    public BirthdayStudent(String birthdayStudent) {
        this.birthdayStudentId = UUID.randomUUID();
        this.birthdayStudent = birthdayStudent;
    }

    public BirthdayStudent(UUID birthdayStudentId, String birthdayStudent) {
        this.birthdayStudentId = birthdayStudentId;
        this.birthdayStudent = birthdayStudent;
    }

    public UUID getBirthdayStudentId() {
        return birthdayStudentId;
    }

    public void setBirthdayStudentId(UUID birthdayStudentId) {
        this.birthdayStudentId = birthdayStudentId;
    }

    public String getBirthdayStudent() {
        return birthdayStudent;
    }

    public void setBirthdayStudent(String birthdayStudent) {
        this.birthdayStudent = birthdayStudent;
    }

    @Override
    public String toString() {
        return "BirthdayStudent{" +
                "birthdayStudentId=" + birthdayStudentId +
                ", birthdayStudent='" + birthdayStudent + '\'' +
                '}';
    }
}
