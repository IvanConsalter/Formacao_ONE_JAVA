package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario"; //object literal
		String outro = new String("Alura"); //má prática
		
		String novo = outro.replace("A", "a");
		
		System.out.println(novo);
		System.out.println("--------------------\n");
		
		System.out.println(novo.toUpperCase());
		System.out.println("--------------------\n");
		
		System.out.println(novo.toLowerCase());
		System.out.println("--------------------\n");
		
		char c = nome.charAt(3);
		System.out.println(c);
		System.out.println("--------------------\n");
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		System.out.println("--------------------\n");
		
		String sub = nome.substring(1);
		System.out.println(sub);
		System.out.println("--------------------\n");
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		System.out.println("--------------------\n");
		
		System.out.println(nome.isEmpty());
		System.out.println("--------------------\n");
		
//		nome = "M a r i o";
//		System.out.println(nome.trim());
		
		System.out.println(nome.contains("ari"));
		
		
		
	}
}
