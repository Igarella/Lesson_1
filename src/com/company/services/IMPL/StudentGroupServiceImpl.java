package com.company.services.IMPL;

import com.company.DTO.StudentGroup;
import com.company.repositories.StudentGroupRepository;
import com.company.repositories.IMPL.StudentGroupRepositoryImpl;
import com.company.services.StudentGroupService;

import java.util.List;
import java.util.UUID;

public class StudentGroupServiceImpl implements StudentGroupService {
    @Override
    public void addCurrentStudentToGroup(StudentGroup studentGroup) {
        StudentGroupRepository repository = new StudentGroupRepositoryImpl();
        repository.addCurrentStudentToGroup(studentGroup);

    }

    @Override
    public StudentGroup getStudentGroupByStudentId(UUID studentId) {
        StudentGroupRepository repository = new StudentGroupRepositoryImpl();
        return repository.getStudentGroupByStudentId(studentId);
    }

    @Override
    public List<StudentGroup> getAllCurrentStudentGroup() {
        StudentGroupRepository repository = new StudentGroupRepositoryImpl();
        return repository.getAllCurrentStudentGroup();
    }

}
