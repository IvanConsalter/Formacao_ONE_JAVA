Quais dos códigos a seguir estão corretos?

Respostas:

1- List<Aluno> alunos = new ArrayList<>();

ArrayList é uma classe que implementa List, logo pode ser referenciada pela sua interface

2- ArrayList<Aluno> alunos = new ArrayList<>();

Porém não está se aproveitando do famoso polimorfismo

3- Collection<Aluno> alunos = new HashSet<>();

Usando bastante seu polimorfismo, declarando o atributo com a "avó", a interface Collection;