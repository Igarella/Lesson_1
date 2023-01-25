package com.company.repositories;

import com.company.DTO.Group;

import java.util.List;
import java.util.UUID;

public interface GroupRepository {
    List<Group> getAllGroups();

    void addStudentToGroupBYStudentId(UUID studentId);

    Group getGroupById(UUID groupId);
}
