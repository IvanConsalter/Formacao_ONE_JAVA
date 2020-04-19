package br.com.collections;

import java.util.Collection;
import java.util.HashSet;

public class ImprimindoAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");
		alunos.add("Maria");
		alunos.add("Caio");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		
		alunos.add("Paulo");
		alunos.add("Caio");
		
		System.out.println("-------------------------------");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos.size());
		
		System.out.println("--------------------------------");
	}

}
