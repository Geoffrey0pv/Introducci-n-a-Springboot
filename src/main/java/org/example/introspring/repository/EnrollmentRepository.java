package org.example.introspring.repository;

import org.example.introspring.entity.Enrollment;
import org.example.introspring.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    List<Enrollment> findByStudentId(Long studentId);  // Método ya definido previamente

    // Query Method para obtener los cursos de un estudiante
    List<Enrollment> findByStudent_id(Long studentId);

    // Query Method para obtener los estudiantes de un curso
    List<Enrollment> findByCourseId(Long courseId);


}
