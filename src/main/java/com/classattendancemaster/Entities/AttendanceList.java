package com.classattendancemaster.Entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Konrad on 2017-03-20.
 */
@Entity
public class AttendanceList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_Id")
    private Long Id;
    private String name;
    private LocalDateTime localDateTime;
    @OneToMany
    private List<Student> studentList;
    @OneToOne
    private Lecturer lecturer;
    @OneToOne
    private Subject subject;

    public AttendanceList() {
    }

    public AttendanceList(String name, LocalDateTime localDateTime) {
        this.name = name;
        this.localDateTime = localDateTime;
    }

    public AttendanceList(String name, LocalDateTime localDateTime, List<Student> studentList, Subject subject, Lecturer lecturer) {
        this.name = name;
        this.localDateTime = localDateTime;
        this.studentList = studentList;
        this.subject = subject;
        this.lecturer = lecturer;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
