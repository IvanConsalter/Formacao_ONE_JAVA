package br.com.collections;

import java.util.LinkedList;
import java.util.List;

public class Iterator {
	
	public static void main(String[] args) {
		
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		letras.forEach(letra -> {
			System.out.println(letra);
		});
		
		System.out.println("Com o Iterator");
		
		java.util.Iterator<String> iterador = letras.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}

}
