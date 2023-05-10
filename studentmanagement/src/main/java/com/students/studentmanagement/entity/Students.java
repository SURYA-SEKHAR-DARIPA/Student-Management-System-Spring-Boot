package com.students.studentmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name="students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "reg_number", nullable = false)
    private String regNumber;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    @Column(name = "contact_number")
    private String contactNumber;
    @Column(name = "email")
    private String email;
    @Column(name="course_enrolled")
    private String courseEnrolled;

    public Students() {

    }
    public Students(String regNumber, String fullName, String contactNumber, String email, String courseEnrolled) {
        this.regNumber = regNumber;
        this.fullName = fullName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.courseEnrolled = courseEnrolled;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(String courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }
}

