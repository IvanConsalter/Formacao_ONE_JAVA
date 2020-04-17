package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaAulas {
	
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Tipos Primitivos", 12);
		Aula aula2 = new Aula("Variaveis", 16);
		Aula aula3 = new Aula("Condicionais", 14);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas + "\n");
		
		System.out.println("Depois de ordenado");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//outro metodo de ordenar ex: por tempo
		System.out.println("\nOrdenando por tempo");
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
	}

}
