package br.com.collections;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso java = new Curso("java-8", "Paulo Silveira");
		
		java.adiciona(new Aula("Tipos primitivos", 12));
		java.adiciona(new Aula("Variaveis", 16));
		java.adiciona(new Aula("Condicionais", 14));
		
		
		java.matricula(new Aluno("Andre Silveira", 222333));
		java.matricula(new Aluno("Roberto Siqueira", 333222));
		java.matricula(new Aluno("Caio Berlanda", 123456));
		
		//iteracao com lambda
		java.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		/*
		//erro UnsupportedOperationException
		//Collections$UnmodifiableCollection
		Set<Aluno> alunos = java.getAlunos();
		
		Aluno novoAluno = new Aluno("Carlos Roberto", 654321);
		alunos.add(novoAluno);
		System.out.println(novoAluno);
		*/
		/*
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(java.getAlunos());
		System.out.println(alunosSincronizados);
		*/
		
		Aluno novoAluno = new Aluno("Carlos Roberto", 654321);
		java.matricula(novoAluno);
		
		System.out.println(java.estaMatriculado(novoAluno));
		
		Aluno nomeInvalido = new Aluno("Ab", 123789);
		System.out.println(nomeInvalido);
	}

	

}