Ainda sobre o jogo de Luan, temos outro trecho do código:

public class Jogo {<br>
    //Código omitido<br>
    private Componente comp;<br>
    public Jogo(Usuario usuario){<br>
       this.comp = usuario;<br>
    }<br>
}


Porém o código acima sequer compila. Qual dos motivos abaixo explica a razão desse acontecimento?

Resposta:

Está sendo feita uma atribuição de objetos de tipos diferentes.