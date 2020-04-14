Você está revisando um projeto do seu amigo e encontrou o código abaixo:

Conta c = new Conta();<br>
c.CAIXA.getCodigo();<br>

A classe Conta está dentro de um outro package e foi importada corretamente.

O que podemos dizer sobre a parte CAIXA no código acima? Marque todas as alternativas corretas:

Resposta:

1- CAIXA é um atributo da instância.


CAIXA é uma atributo da instância, pois usamos a referência c para acessar o atributo. Se fosse estático a chamada seria:

Conta.CAIXA.getCodigo();

2- CAIXA tem visibilidade pública.


Pois no enunciado diz que estamos importando as classes corretamente. Isso significa que a classe Conta está dentro de um outro package.

3- CAIXA é uma referência.

Pois estamos usando o . para chamar o método getCodigo(). Se CAIXA fosso um primitivo não seria possível chamar um método.