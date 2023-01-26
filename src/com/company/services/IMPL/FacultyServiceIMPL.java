package com.company.services.IMPL;

import com.company.DTO.Faculty;
import com.company.repositories.FacultyRepository;
import com.company.repositories.IMPL.FacultyRepositoryImpl;
import com.company.services.FacultyService;

import java.util.List;
import java.util.UUID;

public class FacultyServiceIMPL implements FacultyService {
    @Override
    public void addFaculty(Faculty faculty) {
        FacultyRepository repository = new FacultyRepositoryImpl();
        repository.addFaculty(faculty);

    }

    @Override
    public List<Faculty> getAllFaculties() {
        FacultyRepository repository = new FacultyRepositoryImpl();
        return repository.getAllFaculties();
    }

    @Override
    public Faculty getFacultyById(UUID facultyId) {
        FacultyRepository repository = new FacultyRepositoryImpl();
        return repository.getFacultyById(facultyId);
    }

}
