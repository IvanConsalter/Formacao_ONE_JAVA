Temos a seguinte classe Java:

public class Recibo {

    // atributos da classe e métodos acessadores/alteradores

}

E algumas instâncias dessa classe:


Recibo rec1 = new Recibo();<br>
// atribui valores<br>
Recibo rec2 = new Recibo();<br>
// atribui valores<br>
Recibo rec3 = new Recibo();<br>
// atribui valores<br>

Se criarmos um TreeSet e adicionamos cada um desses objetos teremos uma mensagem de erro. Por quê? Tente fazer o teste na sua casa para descobrir o motivo.


Para adicionarmos um objeto em um TreeSet ele precisa implementar a interface Comparable. Mas o que fazer se estamos trabalhando com uma instância de uma classe que não temos acesso ou não podemos modificar para implementar Comparable? Nesse caso, o construtor do TreeSet recebe como parâmetro um objeto que implementa Comparator. Dessa forma, o critério de comparação pode ser criado em separado da classe na qual opera.