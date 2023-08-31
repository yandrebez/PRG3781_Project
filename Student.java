package com.example.StudentApplication.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String username;
    private String email;
    private String address;
    private String password;
    private String course;

    //default constructor
    public Student() {
    }

    //parameterized constructor
    public Student(Long studentId, String username, String email, String address, String password, String course) {
        this.studentId = studentId;
        this.username = username;
        this.email = email;
        this.address = address;
        this.password = password;
        this.course = course;
    }

    //getters
    public Long getStudentId() {
        return studentId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getCourse() {
        return course;
    }

    //setters
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects
                .equals(studentId, that.studentId) && Objects
                .equals(username, that.username) && Objects
                .equals(email, that.email) && Objects
                .equals(address, that.address) && Objects
                .equals(password, that.password) && Objects
                .equals(course, that.course);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, username, email, address, password, course);
    }

    @Override
    public String toString() {
        return "Student [Address=" + address + ", Course=" + course + ", Email=" + email + ", StudentId=" + studentId + ", Username="
                + username + "]";
    }
}