package com.igrapel.participation.controller;

import com.igrapel.participation.model.Students;
import com.igrapel.participation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getStudentsPage() {
        return "students";
    }

    @GetMapping("/students/list")
    public String getStudents(Model model) {
        List<Students> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "studentsList"; // This should be a Thymeleaf template (e.g., studentsList.html)
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestParam String firstName, @RequestParam String lastName, Model model) {
        Students student = studentService.addStudent(firstName, lastName);
        model.addAttribute("student", student);
        return "result";
    }

    @PostMapping("/addStudentWithId")
    public String addStudentWithId(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName, Model model) {
        Students student = studentService.addStudent(id, firstName, lastName);
        model.addAttribute("student", student);
        return "result";
    }
}
