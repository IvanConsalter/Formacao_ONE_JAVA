Juarez criou as seguintes classes:

public class Pessoa {

    String nome;<br>
    String cpf;<br>
    int idade;<br>
    String logradouro;<br>
    String complemento;<br>
    String numero;<br>
    String bairro;<br>
    String cidade;<br>
    String cep;<br>

}

public class Empresa {

    String razaoSocial;<br>
    String cnpjs;<br>
    String logradouro;<br>
    String complemento;<br>
    String numero;<br>
    String bairro;<br>
    String cidade;<br>
    String cep;<br>
}


Podemos perceber que os atributos logradouro, complemento, numero, bairro, cidade e cep são os mesmos nas duas classes. Essas informações são fortes candidatas para serem externalizadas na classe Endereco e associadas às classes Pessoa e Empresa através de composição.

public class Endereco {

    String logradouro;<br>
    String complemento;<br>
    String numero;<br>
    String bairro;<br>
    String cidade;<br>
    String cep;
<br>
}


Marque a única alternativa verdadeira que modifica corretamente as classes Pessoa e Empresa para utilizarem a classe Endereco.

public class Pessoa {

    String nome;<br>
    String cpf;<br>
    int idade;<br>
    Endereco endereco;<br>
}
<br>
public class Empresa {

    String razaoSocial;<br>
    String cnpjs;<br>
    Endereco endereco;<br>
}