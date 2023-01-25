package com.company.services;

import com.company.DTO.StudentGroup;

import java.util.List;
import java.util.UUID;

public interface StudentGroupService {
    void addCurrentStudentToGroup(StudentGroup studentGroup);

    StudentGroup getStudentGroupByStudentId(UUID studentId);

    List<StudentGroup> getAllCurrentStudentGroup();
}
