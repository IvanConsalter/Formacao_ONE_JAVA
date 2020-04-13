O que está garantido quando usamos o try-with-resources?

try(Conexao con = new Conexao()) {

     con.leDados();

}

Respostas:

1- O bloco finally é criado automaticamente.


Automaticamente é criado um bloco finally. Nele é chamado o método close() do recurso.


2- O recurso precisa implementar o método close().


Automaticamente é criado um bloco finally. Nele é chamado o método close() do recurso.