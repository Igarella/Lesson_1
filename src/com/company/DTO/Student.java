package com.company.DTO;

import java.io.Serializable;
import java.util.*;

public class Student implements Serializable {
    private UUID id;
    private String firstName;
    private String secondName;
    private boolean archived = false;
    private List<Phone> phoneStudent;
    private List<Email> emailsStudent;
    private List<Specialization> specializations;
    private List<Assessment> assessments = new ArrayList<>();

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Assessment> assessments) {
        this.assessments = assessments;
    }

    public List<Specialization> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<Specialization> specializations) {
        this.specializations = specializations;
    }

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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
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

    public Student(String firstName, String secondName, boolean archived) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.secondName = secondName;
        this.archived = archived;
    }

    public Student(UUID id, String firstName, String secondName, boolean archived) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.archived = archived;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", archived=" + archived +
                ", phoneStudent=" + phoneStudent +
                ", emailsStudent=" + emailsStudent +
                ", specializations=" + specializations +
                ", assessments=" + assessments +
                '}';
    }
}
