package com.company.DTO;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Student implements Serializable {
    private UUID id;
    private String firstName;
    private String secondName;
    private List<Phone> phoneStudent;
    private List<Email> emailsStudent;

    public List<Phone> getPhoneStudent() {
        return phoneStudent;
    }

    public void setPhoneStudent(List<Phone> phoneStudent) {
        this.phoneStudent = phoneStudent;
    }

    public List<Email> getEmailsStudent() {
        return emailsStudent;
    }

    public void setEmailsStudent(List<Email> emailsStudent) {
        this.emailsStudent = emailsStudent;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Student(UUID id, String firstName, String secondName) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(String firstName, String secondName) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.secondName = secondName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", phoneStudent=" + phoneStudent +
                ", emailsStudent=" + emailsStudent +
                '}';
    }
}
