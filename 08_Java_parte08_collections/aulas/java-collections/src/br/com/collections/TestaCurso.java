package br.com.collections;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("Java-8", "Paulo Silveira");
		
		java.adiciona(new Aula("Tipos Primitivos", 12));
		java.adiciona(new Aula("Variaveis", 16));
		java.adiciona(new Aula("Condicionais", 14));
		
		System.out.println(java.getAulas());
	}

}
