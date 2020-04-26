Depois de filtrar todos os cursos com mais de 50 alunos, temos um Stream<Curso> como resultado:

Stream<Curso> stream = cursos.stream()<br>
   .filter(c -> c.getAlunos() > 50);

Como podemos transformar esse Stream<Curso> filtrado em uma List<Curso>?

Para isso utilizamos o método collect, da seguinte forma:

List<Curso> cursosFiltrados = cursos.stream()<br>
   .filter(c -> c.getAlunos() > 50)<br>
   .collect(Collectors.toList());<br>