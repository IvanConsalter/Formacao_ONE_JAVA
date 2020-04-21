package br.com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {

public static void main(String[] args) {
		
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimental");	
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
	}


}
