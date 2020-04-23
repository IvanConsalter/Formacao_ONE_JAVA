package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClasseComparator {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("fabrica do codigo");
		palavras.add("caelum");
		
		
		palavras.sort(Comparator.comparing(String::length));
		//palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(palavra -> System.out.println(palavra));
		

		
		
	}
}

