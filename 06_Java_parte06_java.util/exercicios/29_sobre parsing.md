Você está fazendo a leitura de um arquivo de texto com vários números. O problema é que os dados vêm como String, por exemplo:

String diaComoTexto = "29";<br>
int dia = ????;<br>

O que você pode colocar no lugar de ???? para converter o texto?

Respostas:

1- Integer.parseInt(diaComoTexto)

Seria a opção mais adequada pois devolve um primitivo.


2- Integer.valueOf(diaComoTexto)

Mas não seria a melhor opção pois devolve uma referência (e ai é feito um unboxing).