package com.company.services.IMPL;

import com.company.DTO.BirthdayStudent;
import com.company.repositories.BirthdayStudentRepository;
import com.company.repositories.IMPL.BirthdayStudentRepositoryImpl;
import com.company.services.BirthdayStudentService;

import java.util.List;
import java.util.UUID;

public class BirthdayStudentServiceIMPL implements BirthdayStudentService {
    @Override
    public String getBirthdayByStudentId(UUID studentId) {
        BirthdayStudentRepository repository = new BirthdayStudentRepositoryImpl();
        return repository.getBirthdayByStudentId(studentId);
    }

    @Override
    public List<BirthdayStudent> getAllBirthdaysStudents() {
        BirthdayStudentRepository repository = new BirthdayStudentRepositoryImpl();
        return repository.getAllBirthdaysStudents();
    }
}
