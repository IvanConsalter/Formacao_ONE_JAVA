package br.com.collections;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Curso {

	private String curso;
	private String instrutor;
	//private int tempoTotal;
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
	
	public int getTempoTotal() {
		//return tempoTotal;
		//tempoTotal co stream
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		//this.tempoTotal += aula.getTempo();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.curso
				+ ", tempo total: "
				+ this.getTempoTotal() + "min"
				+ ", aulas: "
				+ this.getAulas() + "]";
	}
	
}
