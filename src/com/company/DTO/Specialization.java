package com.company.DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Specialization {
    private UUID specializationId;
    private UUID groupId;
    private UUID facultyId;
    private String specializationName;
    private List<Group> groupsOnSpecialization = new ArrayList<>();

    public Specialization(UUID groupId, UUID facultyId,String specializationName) {
        this.specializationId = UUID.randomUUID();
        this.groupId = groupId;
        this.facultyId = facultyId;
        this.specializationName = specializationName;
    }

    public Specialization(UUID specializationId, UUID groupId, UUID facultyId, String specializationName) {
        this.specializationId = specializationId;
        this.groupId = groupId;
        this.facultyId = facultyId;
        this.specializationName = specializationName;
    }

    public UUID getSpecializationId() {
        return specializationId;
    }

    public void setSpecializationId(UUID specializationId) {
        this.specializationId = specializationId;
    }

    public UUID getGroupId() {
        return groupId;
    }

    public void setGroupId(UUID groupId) {
        this.groupId = groupId;
    }

    public UUID getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(UUID facultyId) {
        this.facultyId = facultyId;
    }

    public List<Group> getGroupsOnSpecialization() {
        return groupsOnSpecialization;
    }

    public void setGroupsOnSpecialization(List<Group> groupsOnSpecialization) {
        this.groupsOnSpecialization = groupsOnSpecialization;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "specializationId=" + specializationId +
                ", groupId=" + groupId +
                ", facultyId=" + facultyId +
                ", groupsOnSpecialization=" + groupsOnSpecialization +
                '}';
    }
}
