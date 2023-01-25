package com.company.repositories;

import com.company.DTO.BirthdayStudent;
import com.company.services.BirthdayStudentService;

import java.util.List;
import java.util.UUID;

public interface BirthdayStudentRepository {

    String getBirthdayByStudentId(UUID studentId);

    List<BirthdayStudent> getAllBirthdaysStudents();

}
