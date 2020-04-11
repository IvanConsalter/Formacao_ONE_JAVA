A Ana está praticando OO com Java e criou uma outra classe Conta com apenas dois atributos e um método. No entanto, como o uso do this é opcional, ela está com dúvida onde se usa a palavra chave this dentro de uma classe.

Ela nos enviou o código abaixo usando os caracteres [] em vários lugares, segue o código:

class Conta {<br>

        [1] double saldo;<br>
        int numero;<br>

        void deposita([2] double valor) {<br>
            [3]saldo = [4]saldo + [5]valor;<br>
        }<br>
}


Repare que temos [1], [2], [3], [4] e [5] como possíveis lugares para colocar o this, mas qual realmente irá funcionar e ser compilado?

Resposta:

Apenas [3] e [4]


Usamos o this dentro de um método para acessar um atributo:

class Conta {<br>

        double saldo;<br>
        int numero;<br>

        void deposita(double valor) {<br>
            this.saldo = this.saldo + valor;<br>
        }<br>
}