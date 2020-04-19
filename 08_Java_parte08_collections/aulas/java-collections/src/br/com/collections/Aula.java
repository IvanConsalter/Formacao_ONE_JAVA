package br.com.collections;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
		
	public Aula(String nome, int tempo) {
		this.titulo = nome;
		this.tempo = tempo;
	}
	
	public String getNome() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	
	@Override
	public String toString() {
		return "Aula: " + this.titulo + ", tempo: " + this.tempo + " min.";
	}

	@Override
	public int compareTo(Aula aula) {
		return this.titulo.compareTo(aula.titulo);
	}
}
