package com.company.DTO;

import java.util.UUID;

public class Specialization {
    private final UUID id; //Final because of Idea
    private final String nameSpecialization;

    public Specialization(String nameSpecialization) {
        this.id = UUID.randomUUID();
        this.nameSpecialization = nameSpecialization;
    }

    public Specialization(UUID id, String nameSpecialization) {
        this.id = id;
        this.nameSpecialization = nameSpecialization;
    }

    public String getNameSpecialization() {
        return nameSpecialization;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Specialization{" +
                "id=" + id +
                ", nameSpecialization='" + nameSpecialization + '\'' +
                '}';
    }
}
