Vou te passar um desafio e fazer algumas perguntas relacionadas com listas. Para responder, investigue a documentação oficial da classe Collections dentro do pacote java.util:

Como podemos inverter a ordem de uma lista?<br>
Como podemos embaralhar todos os elementos de uma lista?<br>
Como podemos rotacionar os elementos de uma lista?<br>
Você consegue descobrir os métodos?<br>

Resposta:

Para inverter a ordem de lista você pode usar o método reverse da classe Collections:

Collections.reverse(lista);<br>
Para embaralhar existe o método shuffle e para rotacionar tem o método rotate:

Collections.shuffle(lista);<br>
Collections.rotate(lista, 5); //rotacionar 5 posicoes<br>
Vale explorar essa classe!