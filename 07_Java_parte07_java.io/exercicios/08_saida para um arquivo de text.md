Veja o código abaixo, que estabelece uma saída com um arquivo de texto:

FileOutputStream fos = new FileOutputStream("lorem2.txt");<br>
OutputStreamWriter osw = new OutputStreamWriter(fos);<br>
BufferedWriter bw = new BufferedWriter(osw);<br>

Quais classes abaixo são alternativas para estabelecer uma mesma saída?

Respostas:


1- java.io.PrintWriter


O PrintWriter é parecido com o PrintStream e já possui vários métodos para imprimir qualquer tipo de dados:

PrintWriter out = new PrintWriter("lorem2.txt");<br>
out.println("Lorem ipsum dolor sit amet");<br>
out.close();<br>

2- java.io.PrintStream

Basta usar:

PrintStream out = new PrintStream("lorem2.txt");<br>
out.println("Lorem ipsum dolor sit amet");<br>
out.close();<br>

Lembrando também que utilizamos o PrintStream quando imprimos algo para o console:

PrintStream console = System.out;<br>
console.println("Lorem ipsum dolor sit amet");<br>


3- java.io.FileWriter


A classe FileWriter foi criada com o propósito de estabelecer uma entrada com um arquivo de texto, por exemplo:

FileWriter fw = new FileWriter("arquivo.txt");