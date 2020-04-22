Por que o seguinte código não funciona?

Object o = s -> System.out.println(s);

Qual erro de compilação acontece? Por quê?

O código não funciona porque Object não é uma interface funcional.

Lembre-se que para trabalhar com lambda, uma interface funcional precisa estar envolvida.

O erro de compilação é bem intuitivo:

The target type of this expression must be a functional interface