package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("Java-8", "Paulo Silveira");
		
		java.adiciona(new Aula("Tipos Primitivos", 12));
		java.adiciona(new Aula("Variaveis", 16));
		java.adiciona(new Aula("Condicionais", 14));
		
		System.out.println(java.getAulas());
		
		List<Aula> aulasImutaveis = java.getAulas();
		
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(java.getTempoTotal());
		
		System.out.println(java);
		
		
	}

}
