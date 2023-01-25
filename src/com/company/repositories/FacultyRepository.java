package com.company.repositories;

import com.company.DTO.Faculty;

import java.util.List;

public interface FacultyRepository {
    void addFaculty(Faculty faculty);

    List<Faculty> getAllFaculties();

}
