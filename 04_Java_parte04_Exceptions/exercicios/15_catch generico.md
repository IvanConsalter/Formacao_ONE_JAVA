Já vimos nesse curso duas formas de capturar várias exceções através do bloco catch. (1) A forma tradicional, que funciona desde inicio do Java, simplesmente repete o bloco catch para cada exceção:

try {<br>
 metodoPerigosoQuePodeLancarVariasExcecoes();<br>
} catch(MinhaExcecao ex) {<br>
 ex.printStackTrace();<br>
} catch(OutraExcecao ex) {<br>
 ex.printStackTrace();<br>
}<br>

E (2) a forma mais atual, que foi introduzido no Java 7, permite definir as várias exceções no mesmo bloco (multi catch):

try {<br>
 metodoPerigosoQuePodeLancarVariasExcecoes();<br>
} catch(MinhaExcecao | OutraExcecao ex) { //multi-catch<br>
 ex.printStackTrace();<br>
}<br>

Você vai encontrar ambas as formas no seu dia a dia de desenvolvedor Java. Agora, veja assinatura do "método perigoso" em questão:

//funciona, podemos colocar duas exceções na assinatura<br>
public void metodoPerigosoQuePodeLancarVariasExcecoes() throws<br> MinhaExcecao, OutraExcecao{ <br>
    //código omitido<br>
}

Vimos mais uma variação do catch, não sintática, mas conceitual. Qual afirmação abaixo pode ser usada para capturar todas exceções desse "método perigoso"?

Importante: Assumindo que ambas as exceções são do tipo checked!

Resposta:

try {<br>
    metodoPerigosoQuePodeLancarVariasExcecoes();<br>
} catch(Exception ex) {<br>
    ex.printStackTrace();<br>
}

Criamos um catch genérico que captura qualquer exceção, incluindo exceções checked.

Isso pode parecer uma boa prática, mas normalmente não é. Como regra geral, sempre tente ser mais especifico possível no bloco catch favorecendo vários blocos catch ou usando multi-catch.