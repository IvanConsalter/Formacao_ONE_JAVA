Abaixo as opçoes sobre a classe java.io.FileWriter que estão corretas:

Respostas:

1- FileWriter pode ser combinado com outros Writers, como BufferedWriter.

Podemos passar o FileWriter para o BufferedWriter:

Writer bw = new BufferedWriter(new FileWriter("arquivo.txt"));

2- É usado para escrever caracteres.

Faz parte da categoria de Reader e Writer, que trabalham com caracteres.


3- É usado para estabelecer uma saída com um arquivo.

Tanto que o construtor do FileWriter recebe o nome do arquivo.