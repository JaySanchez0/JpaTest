package com.test.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="student")
public class Estudiante {
	@Id
	@Column(name="id")
	@JsonIgnore
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private String nombre;
	@ManyToMany
	@JoinTable(name="student_course",
	joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns=@JoinColumn(name="couser_id")
			)
	private List<Curso> cursos = new ArrayList<>();
	public Estudiante() {
	}
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
