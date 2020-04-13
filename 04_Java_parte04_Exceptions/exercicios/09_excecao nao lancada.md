José está assistindo o treinamento Java parte 4: Entendendo exceções e, seguindo o instrutor, resolveu criar a classe Fluxo, a fim de ver como funciona o lançamento de exceções.

A classe possui o método main e outros dois métodos, sendo que no segundo, José instanciou uma ArithmeticException:

public class Fluxo {

    public static void main(String[] args) {

        System.out.println("Início do main");
        metodo1();
        System.out.println("Fim do main");

    }

    private static void metodo1() {

        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");

    }

    private static void metodo2() {

        System.out.println("Início do metodo2");
        ArithmeticException exception = new ArithmeticException();

    }

}


Entretanto, quando José executou a classe, se surpreendeu, pois a exceção não foi lançada. Ajude José, selecionando a alternativa que soluciona o problema.

Resposta:

José instanciou a exceção, mas não a lançou, através do throw:

private static void metodo2() {

    System.out.println("Início do metodo2");
    ArithmeticException exception = new ArithmeticException();
    throw exception;

}

Não basta instanciar a exceção, é necessário lançá-la através do throw.