package com.test.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.test.app.repository.EstudianteRepository;
import com.test.app.model.Estudiante;

@RestController
@RequestMapping(value="/app")
public class AppController {
	@Autowired
	private  EstudianteRepository studentRepository=null;
	
	@RequestMapping(value="/{id}/{name}",method=RequestMethod.GET)
	public ResponseEntity<?> save(@PathVariable int id,@PathVariable String name) {
		studentRepository.save(new Estudiante(name));
		return new ResponseEntity<>(studentRepository.findAll(),HttpStatus.ACCEPTED);
	}
}
