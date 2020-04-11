O Pedro escreveu o método saca abaixo que não está compilando:

//assumindo que esse método está dentro da classe Conta que possui os atributos <br>
public void saca(double valor) {<br>

    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }

}

O que está errado com o método?


Resposta:

Faltou definir o tipo correto do retorno no método.


O método não pode ser declarado como void. Correto é usar o tipo boolean:

public boolean saca(double valor) {<br>

    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }

}