Miguel estava realmente animado com a aula e resolveu melhorar sua classe de exceção EstoqueInsuficienteException, forçando o compilador a verificar se a exceção estaria sendo tratada. Para isso mudou a herança da classe conforme o código abaixo:

public class EstoqueInsuficienteException extends Exception {

    public EstoqueInsuficienteException(String msg)
    {
        super(msg);
    }

}


Contudo, o código do método RealizaCompra passou a dar erro. Analise como está:

public void RealizaCompra(Produto produto) {

    //outras instruções aqui...

    if (totalDeProdutosNoEstoque < 0) {

        throw new EstoqueInsuficienteException();

    }

}


O que Miguel precisa fazer para que seu método volte a compilar?

Resposta:

public void RealizaCompra(Produto produto) throws EstoqueInsuficienteException {

    //outras instruções aqui...

    if (totalDeProdutosNoEstoque < 0) {

        throw new EstoqueInsuficienteException();

    }

}

Isso aí! Precisamos mudar a assinatura do método para explicitar que ele pode lançar tal exceção