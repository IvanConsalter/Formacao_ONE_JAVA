Pedro está estudando para a certificação OCP-JP da Oracle e recebeu o código abaixo:

class ConexaoException extends Exception {
    //------
}

//------

class Conexao {

    public void fecha() throws ConexaoException {

        //implementacao omitida

    }

}

//------

class TesteConexao {

    public static void main(String[] args) {
        Conexao con = new Conexao();
        con.fecha();

    }

}

A descrição diz que o código não compila.

Você consegue ajudar e marcar as opções que servem para deixar o código compilar?

Resposta:

1- Basta adicionar um bloco try-catch na chamada do con.fecha() dentro do método main .

Como a exceção é checked devemos tomar uma "atitude" no método main. Uma forma é usar try-catch:

public static void main(String[] args) {

    Conexao con = new Conexao();

    try {
     con.fecha();
    } catch(ConexaoException ex) {
          ex.printStackTrace();
    }

}


2- Na classe ConexaoException basta estender a classe RuntimeExeption no lugar deException.


Desse forma a exceção se torna unchecked e o compilador não obriga mais "tomar uma atitude".


3- Basta adicionar throws ConexaoException na assinatura do método main.


Como a exceção é checked devemos tomar uma "atitude" no método main. Uma forma é colocar throws na assinatura do main:

 public static void main(String[] args)  throws C