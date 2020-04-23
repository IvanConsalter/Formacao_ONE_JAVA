No lugar de escrever Comparator.comparing(...) você pode usar o importe estático de comparing(...) pra deixar seu código ainda mais enxuto.


Há quem prefira deixar o código ainda mais enxuto, dessa forma:

palavras.sort(comparing(String::length));

Mas claro, isso é opcional. Vai do gosto de cada programador.