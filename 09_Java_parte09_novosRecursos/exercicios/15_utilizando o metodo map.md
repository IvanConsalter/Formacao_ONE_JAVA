Como transformar o nosso Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos?

Podemos fazer essa projeção utilizando o método map:

Stream<String> nomes = cursos.stream().map(Curso::getNome);