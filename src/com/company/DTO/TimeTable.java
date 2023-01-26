package com.company.DTO;
import java.util.UUID;

public class TimeTable {
    private UUID timeTableId;
    private UUID teacherId;
    private UUID subjectId;
    private int hours;

    public UUID getTimeTableId() {
        return timeTableId;
    }

    public void setTimeTableId(UUID timeTableId) {
        this.timeTableId = timeTableId;
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(UUID teacherId) {
        this.teacherId = teacherId;
    }

    public UUID getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(UUID subjectId) {
        this.subjectId = subjectId;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "TimeTable.txt{" +
                "timeTableId=" + timeTableId +
                ", teacherId=" + teacherId +
                ", subjectId=" + subjectId +
                ", hours=" + hours +
                '}';
    }
}
