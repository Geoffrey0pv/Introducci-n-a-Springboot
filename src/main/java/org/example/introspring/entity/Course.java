package org.example.introspring.entity;

import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "A00380495_course")
public class Course {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Profesor professor;

    // Nueva relación
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Enrollment> enrollments;

}
