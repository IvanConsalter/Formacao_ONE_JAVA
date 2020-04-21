Como um programador deve proceder não sabendo qual das implementações de Collection servirá melhor para o nosso sistema?

Resposta:

Deve declarar como Collection<Aluno> alunos pois assim poderá mudar mais facilmente de implementação.


Caso a modelagem do sistema ainda não esteja bem definida, o desenvolvedor irá utilizar a interface Collection<E>. Dessa maneira, terá acesso aos métodos básicos de todas as implementações, como size(), add(), remove() e contains(). Conforme for sentindo necessidade em algo específico, o desenvolvedor fará poucas mudanças em seu código.

Caso sinta necessidade de fazer uma requisição a um elemento específico através da sua posição, trocará de Collection<E> para List<E>. Caso perceba que ordem não importa, porém é necessária uma busca bem rápida (e sem repetições), um Set<E> é mais apropriado.

Enquanto não sentir essa necessidade, provavelmente a Collection<E> será a melhor escolha.