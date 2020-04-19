Vimos que List e Set possuem diferenças mas também similaridades. Alguns métodos de List também se encontram na interface Set.

Qual é o nome da interface que define os métodos que são comuns entre List e Set?

Resposta:

Collection

List e Set estendem a interface Collection.

Sabendo disso, podemos usar a interface como tipo do nosso conjunto:

//Set<String> alunos = new HashSet<>();<br>
Collection<String> alunos = new HashSet<>();<br>
alunos.add("Rodrigo Turini");<br>
alunos.add("Alberto Souza");<br>
alunos.add("Nico Steppat");<br>

Há mais uma interface na hierarquia, mais genérica ainda : Iterable


Por causa dessa interface Iterable podemos iterar com qualquer coleção. Em outras palavras, podemos usar uma coleção no foreach.