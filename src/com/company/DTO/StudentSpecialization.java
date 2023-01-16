package com.company.DTO;

import java.util.List;
import java.util.UUID;

public class StudentSpecialization {
    private UUID id;
    private UUID studentId;
    private UUID specialization;

    public StudentSpecialization(UUID id, UUID studentId, UUID specialization) {
        this.id = id;
        this.studentId = studentId;
        this.specialization = specialization;
    }

    public StudentSpecialization(UUID studentId, UUID specialization) {
        this.id = UUID.randomUUID();
        this.studentId = studentId;
        this.specialization = specialization;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public UUID getSpecialization() {
        return specialization;
    }

    public void setSpecialization(UUID specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "StudentSpecialization{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", specialization=" + specialization +
                '}';
    }
}




