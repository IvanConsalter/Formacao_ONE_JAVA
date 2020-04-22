package br.com.java8.novosrecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum");
		
		//Consumer<String> consumer = new ImprimeNaLinha();
		palavras.sort(new ComparadorPorTamanho());
		palavras.forEach(new ImprimeNaLinha());
		
	}
}

class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String palavra) {
		System.out.println(palavra);
	}
	
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String palavra, String palavra2) {
		if(palavra.length() < palavra2.length()) {
			return -1;
		}
		
		if(palavra.length() > palavra2.length()) {
			return 1;
		}
		
		return 0;
	}
	
	
}