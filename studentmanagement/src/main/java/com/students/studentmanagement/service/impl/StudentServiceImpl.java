package com.students.studentmanagement.service.impl;

import com.students.studentmanagement.entity.Students;
import com.students.studentmanagement.repository.StudentRepository;
import com.students.studentmanagement.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Students> getByKeyword(String keyword) {
        return studentRepository.findByKeyword(keyword);
    }

    @Override
    public Students saveStudent(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public Students getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Students updateStudent(Students students) {
        return studentRepository.save(students);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
}
