O código a seguir cria um Stream<Integer> com a quantidade de alunos dos cursos e em seguida imprime todos eles.

cursos.stream()<br>
   .filter(c -> c.getAlunos() > 50)<br>
   .map(c -> c.getAlunos())<br>
   .forEach(x -> System.out.println(x));<br>

Em que parte desse código podemos tirar proveito da sintaxe de method reference?

No map e também no forEach, da forma como fizemos:

cursos.stream()
   .filter(c -> c.getAlunos() > 50)
   .map(Curso::getAlunos)
   .forEach(System.out::println);