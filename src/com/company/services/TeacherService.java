package com.company.services;

import com.company.DTO.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    void addTeacher(Teacher teacher);

    Teacher getTeacherById(UUID teacherId);
}
