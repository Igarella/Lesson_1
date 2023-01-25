package com.company.services.IMPL;

import com.company.DTO.Group;
import com.company.repositories.GroupRepository;
import com.company.repositories.IMPL.GroupRepositoryIMPL;
import com.company.services.GroupService;

import java.util.List;
import java.util.UUID;

public class GroupServiceIMPL implements GroupService {
    @Override
    public List<Group> getAllGroups() {
        GroupRepository repository = new GroupRepositoryIMPL();
        return repository.getAllGroups();
    }

    @Override
    public void addStudentToGroupBYStudentId(UUID studentId) {
        GroupRepository repository = new GroupRepositoryIMPL();
        repository.addStudentToGroupBYStudentId(studentId);
    }

    @Override
    public Group getGroupById(UUID groupId) {
        GroupRepository repository = new GroupRepositoryIMPL();
        return repository.getGroupById(groupId);
    }

}
