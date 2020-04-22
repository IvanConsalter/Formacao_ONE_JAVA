package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		//Consumer<String> consumer = new ImprimeNaLinha();
		palavras.sort((palavra, palavra2) -> Integer.compare(palavra.length(), palavra2.length()));
		
		palavras.forEach(palavra -> System.out.println(palavra));
		
	}
}




