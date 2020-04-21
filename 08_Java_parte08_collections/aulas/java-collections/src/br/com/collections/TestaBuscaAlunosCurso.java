package br.com.collections;

public class TestaBuscaAlunosCurso {

	public static void main(String[] args) {
		
		Curso java = new Curso("java-8", "Paulo Siveira");
		
		java.adiciona(new Aula("Tipos primitivos", 12));
		java.adiciona(new Aula("Variaveis", 16));
		java.adiciona(new Aula("Condicionais", 14));
		
		
		java.matricula(new Aluno("Andre Silveira", 222333));
		java.matricula(new Aluno("Roberto Siqueira", 333222));
		java.matricula(new Aluno("Caio Berlanda", 123456));
		
		System.out.println(java.buscaMatriculado(123456));
		
		System.out.println(java.buscaMatriculado(123457));
	}
}
