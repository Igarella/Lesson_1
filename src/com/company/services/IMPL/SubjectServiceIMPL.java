package com.company.services.IMPL;

import com.company.DTO.Subject;
import com.company.repositories.IMPL.SubjectRepositoryIMPL;
import com.company.repositories.SubjectRepository;
import com.company.services.SubjectService;

import java.util.List;
import java.util.UUID;

public class SubjectServiceIMPL implements SubjectService {
    @Override
    public List<Subject> getAllSubjects() {
        SubjectRepository repository = new SubjectRepositoryIMPL();
        return repository.getAllSubjects();
    }

    @Override
    public void addSubject(Subject subject) {
        SubjectRepository repository = new SubjectRepositoryIMPL();
        repository.addSubject(subject);
    }

    @Override
    public void deleteSubject(UUID uuid) {

    }

    @Override
    public Subject getSubjectById(UUID subjectId) {
        SubjectRepository repository = new SubjectRepositoryIMPL();
        return repository.getSubjectById(subjectId);
    }
}
