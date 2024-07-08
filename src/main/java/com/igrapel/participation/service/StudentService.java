package com.igrapel.participation.service;


import com.igrapel.participation.model.Students;
import com.igrapel.participation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students addStudent(String firstName, String lastName) {
        Random random = new Random();
        int id = random.nextInt(10000);
        Students student = new Students(id, firstName, lastName);
        return studentRepository.save(student);
    }

    public Students addStudent(int id, String firstName, String lastName) {
        Students student = new Students(id, firstName, lastName);
        return studentRepository.save(student);
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Students> getStudent(int id) {
        return studentRepository.findById(id);
    }
}
