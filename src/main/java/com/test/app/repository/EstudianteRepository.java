package com.test.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.test.app.model.Estudiante;

@Repository("studentRepository")
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer>{
	
}
