Dada a classe Veiculo:

public class Veiculo {

    public void liga() {
        System.out.println("Ligando Veiculo");
    }

}

A classe Carro:

class Carro extends Veiculo {

    public void liga() {
        System.out.println("Ligando Carro");
    }

}

E a classe Moto:

class Moto extends Veiculo {

    public void liga() {
        System.out.println("Ligando Moto");
    }

}

Veja o código com o método main:

public class Teste {

    public static void main(String[] args) {

        Veiculo m = new Moto();
        m.liga();

        Veiculo c = new Carro(); 
        c.liga();

    } 

}

Ao executar, o que será impresso no console?

Resposta:

Ligando Moto

Ligando Carro

Sempre será chamado o método mais específico, primeiro o método de Moto, depois de Carro.