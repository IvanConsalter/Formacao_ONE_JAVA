Um desenvolvedor Java Junior escreveu o seguinte código:

FileWriter fw = new FileWriter("arquivo.txt");

fw.write("Lorem ipsum dolor sit amet ...");<br>
fw.write("\n");<br>
fw.write("tempor incididunt ut labore ...");<br>

fw.close();

Você inspecionou o código e percebeu que pode ser melhorado, para garantir que funcione em todos os sistemas operacionais, como o esperado. O que pode ser feito?

Marque todas as alternativas corretas:

Respostas:

1- Basta substituir a linha:

fw.write("\n")

Por:

fw.write(System.lineSeparator())

Ao usar System.lineSeparator(), garantimos que a nova linha no arquivo de texto é criada baseada nos caracteres do sistema operacional.


2- Troque o FileWriter com PrintWriter, sempre usando o método println para escrita (e sem usar \n).


A classe PrintWriter tem métodos de mais alto nível que já cuidam da nova linha, independente do sistema operacional.