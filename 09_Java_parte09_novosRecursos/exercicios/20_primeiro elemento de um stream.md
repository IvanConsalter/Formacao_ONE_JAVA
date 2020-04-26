Na aula anterior fizemos um filtro para pegar todos os cursos com mais de 50 alunos:

cursos.stream()<br>
   .filter(c -> c.getAlunos() > 50)

Como podemos fazer pra pegar o primeiro elemento desse Stream filtrado?

Podemos usar o método findFirst! Algo como:

cursos.stream()<br>
   .filter(c -> c.getAlunos() > 50)<br>
   .findFirst();<br>