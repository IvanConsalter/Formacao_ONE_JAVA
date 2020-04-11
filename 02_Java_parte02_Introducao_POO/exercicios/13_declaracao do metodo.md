O Pedro escreveu o método saca abaixo que não está compilando:

//assumindo que esse método está dentro da classe Conta que possui os atributos <br>
public void saca(double valor) {<br>

    if(saldo >= valor) {<br>
        saldo -= valor;<br>
        return true;<br>
    } else {<br>
        return false;<br>
    }<br>
}<br>

O que está errado com o método?


Resposta:

Faltou definir o tipo correto do retorno no método.


O método não pode ser declarado como void. Correto é usar o tipo boolean:

public boolean saca(double valor) {<br>

    if(saldo >= valor) {<br>
        saldo -= valor;<br>
        return true;<br>
    } else {<br>
        return false;<br>
    }<br>
}