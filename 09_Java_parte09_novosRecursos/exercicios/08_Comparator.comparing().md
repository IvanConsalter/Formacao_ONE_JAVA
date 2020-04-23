Modifique a forma que estamos fazendo o sort das palavras utilizando o Comparator.comparing().

O código atual está assim:

palavras.sort((s1, s2) -> {

    return Integer.compare(s1.length(), s2.length()); 

});

Como ele ficou após as suas mudanças? O que você achou dessa forma de criar Comparators?


Uma possível solução é:

palavras.sort(Comparator.comparing(s -> s.length()));

