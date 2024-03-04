package com.example.jpa.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes")
    private List<Enrollments> enrollments;

    public Classes() {
    }

    public Classes(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Enrollments> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollments> enrollments) {
        this.enrollments = enrollments;
    }

}
