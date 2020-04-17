package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String curso1 = "Java-8";
		String curso2 = "React";
		String curso3 = "JavaScript";
		String curso4 = "CSS";
		String curso5 = "HTML5";
		
		ArrayList<String> cursos = new ArrayList<>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		
		cursos.remove(3);
		
		System.out.println(cursos);
		System.out.println("O primeiro curso é: " + cursos.get(0));
		
		System.out.println("Ordenando a Lista");
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
		//outro metodo de ler os cursos 
		/* 
		for(int i = 0; i <= cursos.size(); i++) {
			System.out.println("Cursos: " + cursos.get(i));
		} //erro IndexOutOfBoundsException
		*/
		
		//outro metodo de adicionar e ler os cursos
		/*
		cursos.add("HTML5");
		cursos.add("Java-8");
		cursos.add("JavaScript");
		
		for (String curso : cursos) {
			System.out.println(curso);
		}
		*/
	}

}
