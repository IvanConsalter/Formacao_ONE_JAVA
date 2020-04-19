Se quisermos imprimir as aulas que configuramos como unmodifiable list dentro de cursos ordenado por algum critério, qual das opções abaixo é a mais adequada ?

Resposta:

Passar a unmodifiable list no construtor de uma ArrayList tradicional e utilizar o método .sort() de Collections para ordená-la.


O melhor jeito de ordenar uma unmodifiable list seguindo algum critério é nos aproveitarmos da possibilidade de poder *passar a unmodifiable list no construtor de uma ArrayList tradicional* , podendo assim utilizar o método .sort() de Collections.