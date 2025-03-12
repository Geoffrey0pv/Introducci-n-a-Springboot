package org.example.introspring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "A00380495_profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany(mappedBy = "professor")
    private List<Course> cursos;

    //ToDo: Hacer Getters y Setters
}

