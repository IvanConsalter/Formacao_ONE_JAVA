Juarez criou as seguintes classes:

public class Pessoa {

    String nome;
    String cpf;
    int idade;
    String logradouro;
    String complemento;
    String numero;
    String bairro;
    String cidade;
    String cep;

}

public class Empresa {

    String razaoSocial;
    String cnpjs;
    String logradouro;
    String complemento;
    String numero;
    String bairro;
    String cidade;
    String cep;

}


Podemos perceber que os atributos logradouro, complemento, numero, bairro, cidade e cep são os mesmos nas duas classes. Essas informações são fortes candidatas para serem externalizadas na classe Endereco e associadas às classes Pessoa e Empresa através de composição.

public class Endereco {

    String logradouro;
    String complemento;
    String numero;
    String bairro;
    String cidade;
    String cep;

}


Marque a única alternativa verdadeira que modifica corretamente as classes Pessoa e Empresa para utilizarem a classe Endereco.

public class Pessoa {

    String nome;
    String cpf;
    int idade;
    Endereco endereco;

}

public class Empresa {

    String razaoSocial;
    String cnpjs;
    Endereco endereco;

}