package com.company.repositories;

import com.company.DTO.StudentGroup;

import java.util.List;
import java.util.UUID;

public interface StudentGroupRepository {
    void addCurrentStudentToGroup(StudentGroup studentGroup);


    List<StudentGroup> getAllCurrentStudentGroup();

    StudentGroup getStudentGroupByStudentId(UUID studentId);

}
