Pedro deseja testar os ensinamentos do vídeo. Então ele criou uma string com caracteres especiais em português, converteu-os em bytes e depois gerou nova string a partir desses bytes. Contudo, quando ele imprimiu a segunda string ele obteve um problema na codificação.

Veja o código de Pedro:

String s1 = "13º Órgão Oficial";<br>
byte[] bytes = s1.getBytes();<br>
String s2 = new String(bytes, "UTF-8");<br>
System.out.println(s2);<br>

Veja o valor impresso no console:

13? ?rg?o Oficial

Você consegue ajudar Pedro indicando a alternativa com a correção?

Resposta:

Charset utf8 = StandardCharsets.UTF_8;<br>
String s1 = "13º Órgão Oficial";<br>
byte[] bytes = s1.getBytes(utf8);<br>
String s2 = new String(bytes, utf8);<br>
System.out.println(s2);