A classe Pessoa e Endereco de Juarez fez sucesso:

public class Endereco {

    String logradouro;<br>
    String complemento;<br>
    String numero;<br>
    String bairro;<br>
    String cidade;<br>
    String cep;<br>
}

public class Pessoa {

    String nome;<br>
    String cpf;<br>
    int idade;<br>
    Endereco endereco;<br>

}

public class Programa {

    public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro  = "Aveninda XYZ";

    }

}


Marque as opções que contém a alteração que fará o código funcionar em tempo de execução:

Respostas:

1- public class Pessoa {

    String nome;<br>
    String cpf;<br>
    int idade;<br>
    Endereco endereco = new Endereco();<br>

}

A inicialização da propriedade endereco esta sendo realizada na própria classe. Dessa forma, o programador não precisará se lembrar de iniciá-la.


2- public class Programa {

    public static void main(String args[]) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco = new Endereco();
        p.endereco.logradouro  = "Aveninda XYZ";

    }

}


O cliente da classe Pessoa, ou seja, quem a esta utilizando, teve que atribuir uma instância de Endereco à propriedade p.endereco para que não houvesse NullPointerException.