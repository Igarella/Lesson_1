package com.company.DTO;

import java.util.UUID;

public class StudentSpecialization {
    private UUID id;
    private UUID specialization;
    private UUID studentId;

    public StudentSpecialization(UUID specialization, UUID studentId) {
        this.id = UUID.randomUUID();
        this.specialization = specialization;
        this.studentId = studentId;
    }

    public StudentSpecialization(UUID id, UUID specialization, UUID studentId) {
        this.id = id;
        this.specialization = specialization;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentSpecialization{" +
                "id=" + id +
                ", specialization=" + specialization +
                ", studentId=" + studentId +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getSpecialization() {
        return specialization;
    }

    public void setSpecialization(UUID specialization) {
        this.specialization = specialization;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }
}
