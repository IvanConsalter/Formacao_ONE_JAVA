Cláudia escreveu um arquivo em UTF-8 usando um programa no Mac. Quando foi ler esse arquivo no Windows usando o código abaixo, ela encontrou problemas na codificação de caracteres.

Scanner scanner = new Scanner(new File("dados.txt"));<br>
//resto do código aqui...

Ajude Cláudia indicando o código que resolve seu problema.

Resposta:

Scanner scanner = new Scanner(new File("dados.txt"), 
  StandardCharsets.UTF_8.name());

Isso aí! Esse construtor de Scanner recebe como segundo argumento uma referência para o charset UTF-8.