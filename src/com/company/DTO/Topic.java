package com.company.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Topic {
    private UUID id;
    private String name;
    private UUID specializationId;
    private List<Assessment> assessments = new ArrayList<>();

    public List<Assessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(Assessment assessment) {
        this.assessments.add(assessment);
    }

    public Topic(String name, UUID specializationId) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.specializationId = specializationId;
    }

    public Topic(UUID id, String name, UUID specializationId) {
        this.id = id;
        this.name = name;
        this.specializationId = specializationId;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specializationId=" + specializationId +
                ", assessments=" + assessments +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(UUID specializationId) {
        this.specializationId = specializationId;
    }
}
