package com.example.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Students students;

    @ManyToOne
    @JoinColumn(name = "classes_id")
    private Classes classes;

    public Enrollments() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

}
