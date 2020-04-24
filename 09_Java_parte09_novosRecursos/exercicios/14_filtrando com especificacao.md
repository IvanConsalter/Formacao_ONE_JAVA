Utilizando a API de Stream, crie um filtro para todos os cursos que tenham mais de 50 alunos.

Depois disso faça um forEach no resultado. Qual foi a saída do seu código?

Uma possivel solução seria:

cursos.stream()
   .filter(c -> c.getAlunos() > 50)
   .forEach(c -> System.out.println(c.getNome()));