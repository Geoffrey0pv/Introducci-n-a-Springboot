package org.example.introspring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "A00380495_students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String code;
    //Example: A00123456

    private String name;

    private String program;

    // Nueva relación
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

    // Getters y setters

}
