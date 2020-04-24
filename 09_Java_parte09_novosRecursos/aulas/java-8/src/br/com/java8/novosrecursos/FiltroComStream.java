package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FiltroComStream {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//lambda
		//cursos.sort(Comparator.comparingInt(curso -> curso.getNumeroAlunos()));
		
		//method reference
		cursos.sort(Comparator.comparingInt(Curso::getNumeroAlunos));
		cursos.forEach(curso -> System.out.println(curso.getNome()));
		
		System.out.println("-----Stream-----");
		//stream, filter(filtra os cursos com mais de 50 alunos), imprime os numeros 
		cursos.stream()
			.filter(curso -> curso.getNumeroAlunos() > 50)
			.forEach(curso -> System.out.println(curso.getNumeroAlunos()));
		
		//mapeia os cursos por nome e filtra os maiores que 100 alunos
		System.out.println("-----Map-----");
		cursos.stream()
			.filter(curso -> curso.getNumeroAlunos() > 100)
			.map(Curso::getNome)
			.forEach(curso -> System.out.println(curso));;
		
	}

}
