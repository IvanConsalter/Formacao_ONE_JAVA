package br.com.collections;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {

	private String curso;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	
	public Curso(String curso, String instrutor) {
		this.curso = curso;
		this.instrutor = instrutor;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
}
