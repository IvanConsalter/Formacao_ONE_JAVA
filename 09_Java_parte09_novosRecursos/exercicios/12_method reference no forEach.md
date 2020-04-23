Mude o seu forEach pra usar method reference no lugar do lambda:

s -> System.out.println(s)

Nosso código fica parecido com:

palavras.forEach(System.out::println);