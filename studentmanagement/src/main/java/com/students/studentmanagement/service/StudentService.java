package com.students.studentmanagement.service;

import com.students.studentmanagement.entity.Students;

import java.util.List;

public interface StudentService {
    List<Students> getAllStudents();
    List<Students> getByKeyword(String keyword);
    Students saveStudent(Students students);

    Students getStudentById(Long id);
    Students updateStudent(Students students);

    void deleteStudentById(Long id);

}
