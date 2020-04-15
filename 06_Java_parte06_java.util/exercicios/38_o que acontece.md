Veja o código abaixo:

Comparator<String> comp = new Comparator<String>() {

  @Override
  public int compare(String s1, String s2) {
    return s1.compareTo(s2);

  }

};

E as declarações

A) É gerada uma classe anônima.<br>
B) É criado um objeto do tipo Comparator.<br>
C) É instanciada a interface Comparator.<br>
D) É gerada uma classe com o nome o ComparatorString.<br>

Quais afirmações são corretas?

Resposta:

A e B


É gerada uma classe anônima (A) e é criado um objeto do tipo Comparator (B).