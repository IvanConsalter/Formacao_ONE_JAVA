Continuando com a mesma hierarquia de classes:

Temos a classe mãe objeto, dela são filhas funcionario e cliente, da classe funcionario sao filhas gerente e designer

E a declaração do array:

Funcionario[] referencias = new Funcionario[5];

referencias[0] = new Designer();

???? ref = (????) referencias[0];

O que podemos colocar no lugar de ???? para o código compilar?

Respostas:

1- Designer

Como o Designer é um Funcionario o cast é possível (compila) e também rodaria normal.


2- Gerente


Como o Gerente é um Funcionario o cast é possível e compila (mas ao rodar daria ClassCastException).