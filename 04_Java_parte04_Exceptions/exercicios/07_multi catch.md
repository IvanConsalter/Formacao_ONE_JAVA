Temos o seguinte código:

try {<br>
    System.out.println(1/0);<br>
} catch(ArithmeticException ex) {<br>
    ex.printStackTrace();<br>
} catch(NullPointerException ex) {<br>
    ex.printStackTrace();    <br>
}<br>


Marque a opção que demonstra corretamente o código anterior através de Multi-Catch:

Resposta:

try {<br>
    System.out.println(1 / 0);<br>
} catch (ArithmeticException | NullPointerException ex) {<br>
    ex.printStackTrace();<br>
}<br>

Através de um | (pipe) na cláusula catch, podemos capturar mais de uma exceção. Com isso, podemos ter um único bloco para tratar um ou mais exceções.