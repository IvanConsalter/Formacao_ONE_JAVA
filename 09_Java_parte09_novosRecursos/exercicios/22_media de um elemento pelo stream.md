Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.

Uma possível solução é:

cursos.stream()<br>
    .mapToInt(c -> c.getAlunos())<br>
    .average();