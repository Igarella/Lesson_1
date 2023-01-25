package com.company.services;

import com.company.DTO.Group;

import java.util.List;
import java.util.UUID;

public interface GroupService {
    List<Group> getAllGroups();

    void addStudentToGroupBYStudentId(UUID studentId);

    Group getGroupById(UUID groupId);
}
