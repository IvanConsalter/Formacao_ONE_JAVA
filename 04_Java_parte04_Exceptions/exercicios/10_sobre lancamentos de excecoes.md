Sobre o lançamento de exceções, julgue as afirmativas abaixo:

1) Para lançar uma exceção, além de instanciá-la, é necessário lançá-la através do throw.

2) A exceção só pode ser lançada através da sua referência, por exemplo:

ArithmeticException exception = new ArithmeticException();
throw exception;
3) Quando a exceção é lançada, o código para de executar abruptamente.

4) Podemos atribuir uma mensagem à exceção.

Resposta:

A afirmativa 2 é falsa.

A afirmativa 2 é realmente falsa, já que não é necessário guardar a exceção em uma referência, podendo lançá-la diretamente em uma linha só, por exemplo:

throw new ArithmeticException();