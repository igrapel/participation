package com.igrapel.participation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//mark class as an Entity
@Entity
//defining class name as Table name
@Table

public class Students
{
    //Defining book id as primary key
    @Id
    @Column
    private int studentId;
    @Column
    private String studentFirstName;
    @Column
    private String studentLastName;
    @Column
    private int participation;

    public Students()
    {
       participation = 0;
    }

    public Students(int studentId, String studentFirstName, String studentLastName) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.participation = 0;
    }

    public Students(int studentId, String studentFirstName, String studentLastName, int participation) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.participation = participation;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getParticipation() {
        return participation;
    }

    public void setParticipation(int participation) {
        this.participation = participation;
    }
}
