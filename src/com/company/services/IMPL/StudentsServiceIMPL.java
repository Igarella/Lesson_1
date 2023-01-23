package com.company.services.IMPL;

import com.company.DTO.*;
import com.company.repositories.*;
import com.company.repositories.IMPL.*;
import com.company.services.StudentsService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentsServiceIMPL implements StudentsService {
    @Override
    public List<Student> getAllStudents() {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        return repository.getAllStudents();
    }

    @Override
    public void addStudent(Student student) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        repository.addStudent(student);
    }

    @Override
    public void deleteStudent(UUID uuid) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        repository.deleteStudent(uuid);
    }


    @Override
    public Student getStudentById(UUID id) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        Student student = repository.getStudentById(id);
        PhonesRepository phonesRepository = new PhoneRepositoryIMPL();
        List<Phone> phoneList = phonesRepository.getPhoneByStudentId(id);
        student.setPhoneStudent(phoneList);
        EmailRepository emailRepository = new EmailRepositoryIMPL();
        List<Email> emailList = emailRepository.getEmailByStudentId(id);
        student.setEmailsStudent(emailList);
        StudentSpecializationRepository studentSpecializationRepository = new StudentSpecializationRepositoryIMPL();
        List<StudentSpecialization> studentSpecializationList = studentSpecializationRepository.getAllStudentSpecializations();//достал лист ВСЕХ специализаций
        List<Specialization> specializations = new ArrayList<>();
        for (StudentSpecialization studentSpecialization : studentSpecializationList) {
            UUID specializationId = studentSpecialization.getSpecialization();
            SpecializationRepository specializationRepository = new SpecializationRepositoryIMPL();
           String name = specializationRepository.getNameById(specializationId);
            Specialization specialization = new Specialization(specializationId, name);
            specializations.add(specialization);
        }
        student.setSpecializations(specializations);
        return student;
    }

    @Override
    public List<Student> getDeletedStudents() {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        return repository.getDeletedStudents();
    }
}


