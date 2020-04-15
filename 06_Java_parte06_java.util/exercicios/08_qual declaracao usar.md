Veja a hierarquia de classes:

Temos a classe mãe objeto, dela são filhas funcionario e cliente, da classe funcionario sao filhas gerente e designer

E a declaração do array:

????[] referencias = new ????[5];

referencias[0] = new Designer();<br>
referencias[1] = new Gerente();

Designer designer = (Designer) referencias[0];<br>
Gerente gerente = (Gerente) referencias[1];

O que podemos colocar no lugar de ???? para o código compilar?

Respostas:

1- Funcionario

Como os tipos Designer e Gerente são Funcionarios basta colocar:

2- Funcionario[] referencias = new Funcionario[5];

Como o tipo consegue guardar qualquer tipo Object de referências o código compilar:

Object[] referencias = new Object[5];