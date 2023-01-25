package com.company.services;

import com.company.DTO.Faculty;

import java.util.List;

public interface FacultyService {
    void addFaculty(Faculty faculty);

    List<Faculty> getAllFaculties();
}
