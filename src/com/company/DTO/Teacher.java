package com.company.DTO;

import java.util.UUID;

public class Teacher {
    private UUID teacherId;
    private UUID facultyId;
    private String name;

    public UUID getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(UUID teacherId) {
        this.teacherId = teacherId;
    }

    public UUID getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(UUID facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", facultyId=" + facultyId +
                ", name='" + name + '\'' +
                '}';
    }
}
