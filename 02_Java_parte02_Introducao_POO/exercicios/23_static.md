Luan desenvolveu um jogo, e quer sempre manter o número de jogadores atualizados. Para isso Luan escreveu o código abaixo:

public class Jogador {<br>
    //Código omitido<br>
    private int total = 0;<br>

    public Jogador(//atributos){<br>
       total++;<br>
    }<br>
}


Porém o contador sempre apresenta 1 após inserir um novo jogador. Qual dos motivos abaixo explica a razão desse acontecimento?

Resposta:

O total deveria estar como estático, assim sempre que fosse criado um novo objeto do tipo Jogador não seria criado um novo total, mantendo o valor correto.