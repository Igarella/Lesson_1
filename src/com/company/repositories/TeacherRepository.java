package com.company.repositories;

import com.company.DTO.Teacher;

import java.util.List;
import java.util.UUID;

public interface TeacherRepository {
    List<Teacher> getAllTeachers();

    void addTeacher(Teacher teacher);

    Teacher getTeacherById(UUID teacherId);
}
