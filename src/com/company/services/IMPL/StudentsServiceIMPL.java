package com.company.services.IMPL;

import com.company.DTO.*;
import com.company.repositories.*;
import com.company.repositories.IMPL.*;
import com.company.services.EmailService;
import com.company.services.StudentSpecializationService;
import com.company.services.StudentsService;

import java.io.IOException;
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
    public void writeStudent(List<Student> studentList) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        repository.writeStudent(studentList);
    }

    @Override
    public void addStudent(Student student) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        repository.addStudent(student);
    }

    @Override
    public void deleteStudent(UUID uuid) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        try {
            repository.deleteStudent(uuid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Student getStudentById(UUID id) {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        Student student = repository.getStudentById(id);
        PhonesRepository phonesRepository = new PhoneRepositoryIMPL();
        List<Phone> phoneList = phonesRepository.getPhoneByStudentId(id);
//        student.setPhoneStudent(phoneList);
        EmailRepository emailRepository = new EmailRepositoryIMPL();
        List<Email> emailList = emailRepository.getEmailByStudentId(id);
//        student.setEmailsStudent(emailList);
        StudentSpecializationRepository repository1 = new StudentSpecializationRepositoryIMPL();
        List<StudentSpecialization> studentSpecializationList = repository1.getStudentSpecializationByStudentId(id);//достал лист ВСЕХ специализаций
        List<Specialization> specializations = new ArrayList<>();
        for (StudentSpecialization studentSpecialization : studentSpecializationList) {
            UUID specializationId = studentSpecialization.getSpecialization(); //присвоение каждой специализации айди
            SpecializationRepository specializationRepository = new SpecializationRepositoryIMPL();// идем в репозиторий специализаций
           String name = specializationRepository.getNameById(specializationId); // берем имя специализации по айди
            Specialization specialization = new Specialization(specializationId, name); //создаем сп
            specializations.add(specialization);
        }
        student.setSpecializations(specializations);
        return student;
    }
}

//todo почему мы в этом методе присваем студенту дополнительные поля?
