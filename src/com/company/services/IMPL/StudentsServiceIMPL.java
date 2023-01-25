package com.company.services.IMPL;

import com.company.DTO.*;
import com.company.repositories.*;
import com.company.repositories.IMPL.*;
import com.company.services.ComplexStudentService;
import com.company.services.GroupService;
import com.company.services.StudentGroupService;
import com.company.services.StudentsService;

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
        StudentGroupService service = new StudentGroupServiceImpl();
        StudentGroup studentGroup = service.getStudentGroupByStudentId(student.getId());
        GroupService groupService = new GroupServiceIMPL();
        Group group = groupService.getGroupById(studentGroup.getGroupId());
        student.setGroupName(group.getGroupName());
        ComplexStudentService complexStudentService = new ComplexStudentServiceImpl();
        ComplexId complexId = complexStudentService.getComplexIdByStudentId(student.getId());


//        StudentSpecializationRepository studentSpecializationRepository = new StudentSpecializationRepositoryIMPL();
//        List<StudentSpecialization> studentSpecializationList = studentSpecializationRepository.getAllStudentSpecializations();//достал лист ВСЕХ специализаций
//        List<Subject> subjects = new ArrayList<>();
//        for (StudentSpecialization studentSpecialization : studentSpecializationList) {
//            UUID subjectId = studentSpecialization.getSpecialization();
//            SubjectRepository subjectRepository = new SubjectRepositoryIMPL();
//           String name = subjectRepository.getNameById(subjectId);
//            Subject subject = new Subject(subjectId, name);
//            subjects.add(subject);
//        }
//        student.setSubjects(subjects);
        return student;
    }

    @Override
    public List<Student> getDeletedStudents() {
        StudentsRepository repository = new StudentsRepositoryIMPL();
        return repository.getDeletedStudents();
    }
}


