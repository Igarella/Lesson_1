package com.company.services;

import com.company.DTO.BirthdayStudent;

import java.util.List;
import java.util.UUID;

public interface BirthdayStudentService {

    String getBirthdayByStudentId(UUID studentId);

    List<BirthdayStudent> getAllBirthdaysStudents();


}
