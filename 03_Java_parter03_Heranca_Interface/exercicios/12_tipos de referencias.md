Continuando com o exemplo Veiculo, Moto e Carro:

public class Veiculo {

    public void liga() {
        System.out.println("Ligando Veiculo");
    }

}

public class Carro extends Veiculo {

    public void liga() {
        System.out.println("Ligando Carro");
    }

}

public class Moto extends Veiculo {

    public void liga() {
        System.out.println("Ligando Moto");
    }

}

E veja o código quase completo:

public class Teste {

    public static void main(String[] args) {

        ???? v = new Carro(); 

    } 

}


O que podemos inserir no lugar de ???? para compilar o código sem erros?

Resposta:

1- Carro


Podemos sempre usar o mesmo tipo na referência e objeto.

2- Veiculo


Pois o Carro é um Veiculo.