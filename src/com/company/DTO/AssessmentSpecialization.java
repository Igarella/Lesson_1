package com.company.DTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class AssessmentSpecialization {
    private UUID id;
    private UUID studentId;
    private UUID specialization;
    private int mark;
//    private Map<String, List<Integer>> specializationsAnsMarks = new HashMap<>();

    public void setId(UUID id) {
        this.id = id;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public void setSpecialization(UUID specialization) {
        this.specialization = specialization;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public AssessmentSpecialization(UUID studentId, UUID specialization, int mark) {
        this.id = UUID.randomUUID();
        this.studentId = studentId;
        this.specialization = specialization;
        this.mark = mark;
    }

    public AssessmentSpecialization(UUID id, UUID studentId, UUID specialization, int mark) {
        this.id = id;
        this.studentId = studentId;
        this.specialization = specialization;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "AssessmentSpecialization{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", specialization=" + specialization +
                ", mark=" + mark +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public UUID getSpecialization() {
        return specialization;
    }

    public int getMark() {
        return mark;
    }
}
