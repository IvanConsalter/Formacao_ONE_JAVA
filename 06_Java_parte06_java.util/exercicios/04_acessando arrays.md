Continuando os estudos para certificação, você encontrou mais um trecho de código:

ContaPoupanca[] contas = new ContaPoupanca[10];<br>
ContaPoupanca cp1 = new ContaPoupanca(11,22);<br>
ContaPoupanca cp2 = new ContaPoupanca(33,44);<br>

contas[0] = cp1;<br>
contas[4] = cp2;<br>

System.out.println(contas[1].getNumero());

Executando esse trecho dentro do método main do nosso projeto, qual é o resultado?

Resposta:

NullPointerException


Pois estamos acessando o segundo elemento do array (a posição 1) e essa posição ainda está null:

System.out.println(contas[1].getNumero());<br>
Consequentemente recebemos uma NullPointerException.
