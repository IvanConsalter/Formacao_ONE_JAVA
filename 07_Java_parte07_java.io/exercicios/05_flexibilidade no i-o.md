Foi mostrado que não temos uma única forma de leitura, nem de escrita. Conseguimos ler e escrever bytes e caracteres. Sem falar que podemos usar a entrada/saída padrão do computador assim como um arquivo de texto.

Por que é possível alterar a origem da leitura e o destino da escrita de forma fácil com Java IO?

Resposta:

Pois java.io fornece classes abstratas genéricas tanto para leitura (InputStream e Reader) quanto para escrita (OutputStream e Writer). Com as classes abstratas não precisamos saber qual a implementação usada na execução do código.

Podemos trocar as implementações sem precisar fazer muitas alterações no nosso código. Ficamos isolados da implementação de leitura ou escrita.