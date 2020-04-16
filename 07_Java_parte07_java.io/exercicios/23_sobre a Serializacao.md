Sobre a serialização do mundo java.io, podemos afirmar:

Respostas:

1- Funciona em cascata. Por exemplo, se um objeto Livro possui um Autor, ambos, o Livro e o Autor, serão serializados.

A serialização sempre funciona em cascata, mas há a possibilidade de usar a palavra chave transient para "fugir" da serialização de um determinado atributo.


2- Para o objeto se tornar serializável, é preciso implementar a interface java.io.Serializable.

Basta implementar a interface java.io.Serializable na classe e nas classes dos atributos. Por exemplo, a classe String já implementa essa interface e por isso podemos serializar strings.


3- Não é preciso colocar o atributo serialVersionUID para a serialização funcionar.

Não somos obrigados a colocar explicitamente o atributo serialVersionUID, mas é boa prática.


4- Os objetos sempre guardam a versão da classe.

Qualquer objeto serializado possui a versão da classe. Se não colocarmos o atributo serialVersionUID explicitamente, a versão será gerada na hora de rodar.