package com.company.services.IMPL;

import com.company.DTO.Email;
import com.company.DTO.Phone;
import com.company.DTO.Student;
import com.company.repositories.EmailRepository;
import com.company.repositories.IMPL.EmailRepositoryIMPL;
import com.company.repositories.IMPL.PhoneRepositoryIMPL;
import com.company.repositories.IMPL.StudentsRepositoryIMPL;
import com.company.repositories.PhonesRepository;
import com.company.repositories.StudentsRepository;
import com.company.services.EmailService;
import com.company.services.StudentsService;

import java.io.IOException;
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
        student.setPhoneStudent(phoneList);
        EmailRepository emailRepository = new EmailRepositoryIMPL();
        List<Email> emailList = emailRepository.getEmailByStudentId(id);
        student.setEmailsStudent(emailList);
        return student;
    }
}
