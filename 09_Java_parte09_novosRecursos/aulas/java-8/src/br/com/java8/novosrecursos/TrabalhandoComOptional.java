package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrabalhandoComOptional {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//pega o primeiro curso com mais de 50 alunos
		Optional<Curso> cursosFiltrados = cursos.stream()
			.filter(curso -> curso.getNumeroAlunos() > 50)
			.findFirst();
		
		System.out.println("Primeiro curso com mais de 50 alunos");
		System.out.println(cursosFiltrados.get().getNome() + "\n");
		
		//pega qualquer curso com mais de 50 alunos
		Optional<Curso> cursosFiltrados2 = cursos.stream()
			.filter(curso -> curso.getNumeroAlunos() > 50)
			.findAny();
		
		System.out.println("Primeiro qualuer com mais de 50 alunos");
		System.out.println(cursosFiltrados2.get().getNumeroAlunos() + "\n");
		
		//calcula a media de quantidade de alunos com stream, mapToInt e average
		OptionalDouble mediaAlunos = cursos.stream()
			.mapToInt(curso -> curso.getNumeroAlunos())
			.average();
		
		System.out.println("Media da quantidade de alunos por curso");
		System.out.println(mediaAlunos + "\n");
		
		//imprime uma lista de cursos com mais de 50 alunos
		System.out.println("Imprime uma lista de cursos com mais de 50 alunos");
		cursos.stream()
			.filter(curso -> curso.getNumeroAlunos() > 50)
			.collect(Collectors.toList())
			.forEach(curso -> System.out.println(curso.getNome()));
	}

}
