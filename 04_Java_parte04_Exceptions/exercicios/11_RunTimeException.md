Miguel está seguindo o curso e decidiu criar sua própria exceção para representar a violação de uma regra em sua aplicação de estoque. Escreveu o código abaixo:

public class EstoqueInsuficienteException {
}


Em seguida, todo feliz e faceiro, foi usar a exceção recém-criada em sua aplicação:

public void RealizaCompra(Produto produto) {

    //outras instruções aqui...

    if (totalDeProdutosNoEstoque < 0) {
        throw new EstoqueInsuficienteException();

    }

}


Mas está recebendo um erro de compilação na hora de instanciar a classe.

Ajude Miguel indicando o que ele precisa fazer para que a aplicação volte a funcionar.

Resposta:

Miguel precisa fazer com a classe EstoqueInsuficienteException herde de alguma classe na hierarquia de Throwable. Por exemplo RuntimeException:

public class EstoqueInsuficienteException extends RuntimeException {
}