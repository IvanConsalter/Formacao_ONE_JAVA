Veja o código abaixo, que deve estar dentro do método main:

Funcionario f = new Gerente();

f.autentica(1234);

Baseado no que você aprendeu na aula, por que o código não compilou?

Resposta:

Porque a referência f é do tipo Funcionario e a classe Funcionario não tem o método autentica.


Quem define o que podemos chamar é a referência, que é do tipo Funcionario, e a classe Funcionario realmente não tem esse método.