Talvez você tenha percebido que alguns métodos da classe String recebem uma variável do tipo CharSequence. O tipo CharSequence é uma interface que a própria classe String implementa (pois uma String é uma sequência de caracteres!

public class String implements CharSequence {

Quando usamos a classe String até poderìamos declarar a variável com o tipo da interface, mas isso é raro de se ver:

CharSequence seq = "é uma sequencia de caracteres";

O interessante é que existem outras classes que também implementam a interface CharSequence. Em outras palavras, existem outras classes que são sequências de caracteres além da classe String. Por quê?

A classe StringBuilder

Vimos que a classe String é especial pois gera objetos imutáveis. Isso é considerado benéfico pensando no design mas é ruim pensando no desempenho (e por isso devemos usar aspas duplas na criação, pois a JVM quer contornar os problemas no desempenho com otimizações).

Agora vem um problema: imagina que você precisa criar um texto enorme e precisa concatenar muitas String, por exemplo:

String texto = "Socorram";<br>
texto = texto.concat("-");<br>
texto = texto.concat("me");<br>
texto = texto.concat(", ");<br>
texto = texto.concat("subi ");<br>
texto = texto.concat("no ");<br>
texto = texto.concat("ônibus ");<br>
texto = texto.concat("em ");<br>
texto = texto.concat("Marrocos");<br>
System.out.println(texto); <br>

Nesse pequeno exemplo já criamos vários objetos, só porque estamos concatenando algumas Strings. Isso é nada bom pensando no desempenho e para resolver isso existe a classe StringBuilder que ajuda na concatenação de Strings de forma mais eficiente.

Veja o mesmo código usando o StringBuilder:

StringBuilder builder = new StringBuilder("Socorram");<br>
builder.append("-");<br>
builder.append("me");<br>
builder.append(", ");<br>
builder.append("subi ");<br>
builder.append("no ");<br>
builder.append("ônibus ");<br>
builder.append("em ");<br>
builder.append("Marrocos");<br>
String texto = builder.toString();<br>
System.out.println(texto);<br>

O StringBuilder é uma classe comum. Repare que usamos o new para a criação do objeto. Além disso, como o objeto é mutável, utilizamos a mesma referência, sem novas atribuições.

A interface CharSequence
Agora o legal é que a classe StringBuilder também implementa a interface CharSequence:

public class StringBuilder implements CharSequence {

CharSequence cs = new StringBuilder("também é uma sequencia de caracteres");

Isso faz que alguns métodos da classe String saibam trabalhar com o StringBuilder, por exemplo:

String nome = "ALURA";<br>
CharSequence cs = new StringBuilder("al");<br>

nome = nome.replace("AL", cs);<br>

System.out.println(nome);<br>

Vice-versa a classe StringBuilder tem métodos que recebem o tipo CharSequence. Dessa forma podemos trabalhar de maneira compatível com as duas classes, baseado numa interface comum.