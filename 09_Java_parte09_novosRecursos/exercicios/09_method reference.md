Mude o lambda que você escreveu no método comparing para um method reference.

O código atual é esse:

palavras.sort(Comparator.comparing(s -> s.length()));

Qual a vantagem de usar essa abordagem?

Nosso código fica assim:

palavras.sort(Comparator.comparing(String::length));

A vantagem pode ser legibilidade. Nosso código fica ainda mais enxuto.

Mais importante ainda é perceber que a inferencia de tipo é mais forte, já que explicitamente estamos dizendo que o método length pertence a String.