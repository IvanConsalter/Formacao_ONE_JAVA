Crie em seu projeto a seguinte classe Curso:

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

Crie também uma nova classe com um método main. Nela crie a seguinte lista com alguns cursos:

List<Curso> cursos = new ArrayList<Curso>();<br>
cursos.add(new Curso("Python", 45));<br>
cursos.add(new Curso("JavaScript", 150));<br>
cursos.add(new Curso("Java 8", 113));<br>
cursos.add(new Curso("C", 55));<br>

Como você faria pra ordenar essa lista pela quantidade de alunos?

Você pode escolher entre usar um expressão lambda ou method reference.

Com lambda:

cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

Com method reference:

cursos.sort(Comparator.comparingInt(Curso::getAlunos));