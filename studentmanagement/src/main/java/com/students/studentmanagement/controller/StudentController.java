package com.students.studentmanagement.controller;

import com.students.studentmanagement.entity.Students;
import com.students.studentmanagement.service.StudentService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/search")
    public String searchData(Students students, Model model, String keyword){
        List<Students> list = studentService.getByKeyword(keyword);
        model.addAttribute("list", list);
        return "search_details";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        Students students=new Students();
        model.addAttribute("student",students);
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Students students){
        studentService.saveStudent(students);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Students students, Model model){

        Students existingStudent=studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setRegNumber(students.getRegNumber());
        existingStudent.setFullName(students.getFullName());
        existingStudent.setContactNumber(students.getContactNumber());
        existingStudent.setEmail(students.getEmail());
        existingStudent.setCourseEnrolled(students.getCourseEnrolled());

        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

    @RequestMapping("/students/course")
    public String getCourse(){
        return "course";
    }

}
