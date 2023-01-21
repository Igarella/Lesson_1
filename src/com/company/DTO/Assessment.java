package com.company.DTO;

import java.util.UUID;

public class Assessment {
    private UUID id;
    private UUID studentSpecializationId;
    private int mark;
    private UUID topicId;

    public UUID getTopicId() {
        return topicId;
    }

    public void setTopicId(UUID topicId) {
        this.topicId = topicId;
    }

    public Assessment(UUID studentSpecializationId, int mark) {
        this.id = UUID.randomUUID();
        this.studentSpecializationId = studentSpecializationId;
        this.mark = mark;
    }

    public Assessment(UUID id, UUID studentSpecializationId, int mark) {
        this.id = id;
        this.studentSpecializationId = studentSpecializationId;
        this.mark = mark;
    }

    public Assessment(UUID id, UUID studentSpecializationId, int mark, UUID topicId) {
        this.id = id;
        this.studentSpecializationId = studentSpecializationId;
        this.mark = mark;
        this.topicId = topicId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getStudentSpecializationId() {
        return studentSpecializationId;
    }

    public void setStudentSpecializationId(UUID studentSpecializationId) {
        this.studentSpecializationId = studentSpecializationId;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "id=" + id +
                ", studentSpecializationId=" + studentSpecializationId +
                ", mark=" + mark +
                ", topicId=" + topicId +
                '}';
    }
}
