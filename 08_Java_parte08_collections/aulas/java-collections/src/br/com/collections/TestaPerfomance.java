package br.com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
	
	public static void main(String[] args) {
		
		                              //intercalar entre HashSet e ArrayList
		Collection<Integer> numeros = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++) {
			numeros.add(i);
		}
		
		for (Integer numero : numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
