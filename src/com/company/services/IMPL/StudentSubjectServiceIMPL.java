package com.company.services.IMPL;

import com.company.DTO.StudentSubject;
import com.company.repositories.IMPL.StudentSubjectRepositoryIMPL;
import com.company.repositories.StudentSubjectRepository;
import com.company.services.StudentSubjectService;

import java.util.List;
import java.util.UUID;

public class StudentSubjectServiceIMPL implements StudentSubjectService {

    @Override
    public void addSubjectStudent(StudentSubject studentSubject) {
        StudentSubjectRepository repository = new StudentSubjectRepositoryIMPL();
        repository.addSubjectStudent(studentSubject);
    }

    @Override
    public List<StudentSubject> getAllStudentSubjects() {
        StudentSubjectRepository subjectRepository = new StudentSubjectRepositoryIMPL();
        subjectRepository.getAllStudentSubjects();
        return subjectRepository.getAllStudentSubjects();
    }

    @Override
    public List<StudentSubject> getStudentSubjectsByStudentId(UUID studentId) {
        StudentSubjectRepository subjectRepository = new StudentSubjectRepositoryIMPL();
        return subjectRepository.getStudentSubjectsByStudentId(studentId);
    }

    @Override
    public StudentSubject getStudentSubjectsByStudentAndSubjectId(UUID studentId, UUID subjectId) {
        StudentSubjectRepository repository = new StudentSubjectRepositoryIMPL();
        return repository.getStudentSubjectByStudentSubjectId(studentId, subjectId);
    }

}
