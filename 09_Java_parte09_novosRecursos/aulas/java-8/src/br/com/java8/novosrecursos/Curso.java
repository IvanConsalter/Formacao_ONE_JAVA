package br.com.java8.novosrecursos;

public class Curso {
	
	private String nome;
	private int numeroAlunos;
	
	public Curso(String nome, int numeroAlunos) {
		this.nome = nome;
		this.numeroAlunos = numeroAlunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroAlunos() {
		return numeroAlunos;
	}
	
	
}
