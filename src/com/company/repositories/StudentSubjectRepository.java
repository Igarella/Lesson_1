package com.company.repositories;

import com.company.DTO.StudentSubject;

import java.util.List;
import java.util.UUID;

public interface StudentSubjectRepository {
    void addSubjectStudent(StudentSubject studentSubject);


    List<StudentSubject> getAllStudentSubjects();

    StudentSubject getStudentSubjectByStudentSubjectId(UUID studentId, UUID subjectId);

    List<StudentSubject> getStudentSubjectsByStudentId(UUID studentId);
}


