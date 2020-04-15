Você está se preparando para a certificação Java e passou pelo código seguinte:

ContaPoupanca[] contas = new ContaPoupanca[10];<br>
ContaPoupanca cp1 = new ContaPoupanca(11,22);<br>
ContaPoupanca cp2 = new ContaPoupanca(33,44);<br>

contas[0] = cp1;<br>
contas[1] = cp1;<br>
contas[4] = cp2;<br>
contas[5] = cp2;<br>

ContaPoupanca ref1 = contas[1];<br>
ContaPoupanca ref2 = contas[4];<br>

Quantas referências apontam para a ContaPoupanca com a agencia 33 e número 44?

Resposta:

4

1) ContaPoupanca cp2 = new ContaPoupanca(33, 44);
2) contas[4] = cp2;
3) contas[5] = cp2;
4) ContaPoupanca ref2 = contas[4];