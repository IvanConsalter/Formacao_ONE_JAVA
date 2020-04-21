Aprendemos a percorrer uma Collection em Java 8 usando o método forEach. Vejamos um exemplo:

Set<String> conjunto = new HashSet<>();<br>
conjunto.add("A");<br>
conjunto.add("A"); // não adiciona, já existe<br>
conjunto.add("B");<br>

conjunto.forEach(letra -> {

    System.out.println(letra);

});

Antes do Java 8 usávamos:

for(String letra: conjunto) {

    System.out.println(letra);

}

No entanto, voltando ao passo mais longínquo, mais propriamente antes do Java 5, essa estrutura não existia. Se não existia, como era possível iterar em um conjunto (Set) se ele não possui acesso indexado como uma lista que possui o método get? Percorríamos uma lista através de um Iterator!

É um objeto que todas as coleções nos dão acesso e serve para iterar entre os objetos dentro da coleção. A ordem na qual os elementos são devolvidos pelo Iterator depende da implementação da Collection utilizada.

Vejamos um exemplo:

Set<Aluno> alunos = javaColecoes.getAlunos();<br>
Iterator<Aluno> iterador = alunos.iterator();<br>

while (iterador.hasNext()) {<br>
    System.out.println(iterador.next());<br>
}<br>