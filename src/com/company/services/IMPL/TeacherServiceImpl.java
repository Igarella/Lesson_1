package com.company.services.IMPL;

import com.company.DTO.Teacher;
import com.company.repositories.IMPL.TeacherRepositoryImpl;
import com.company.repositories.TeacherRepository;
import com.company.services.TeacherService;

import java.util.List;
import java.util.UUID;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public List<Teacher> getAllTeachers() {
        TeacherRepository repository = new TeacherRepositoryImpl();
        repository.getAllTeachers();
        return null;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        TeacherRepository repository = new TeacherRepositoryImpl();
        repository.addTeacher(teacher);
    }

    @Override
    public Teacher getTeacherById(UUID teacherId) {
        TeacherRepository repository = new TeacherRepositoryImpl();
        return repository.getTeacherById(teacherId);
    }
}
