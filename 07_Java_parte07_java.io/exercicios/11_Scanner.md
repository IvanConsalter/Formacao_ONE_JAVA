Qual a forma correta de ler arquivos utilizando nossa classe Scanner?

Resposta:

Scanner sc = new Scanner(new File("arquivo.txt"));

Neste caso o scanner vai conseguir ler o conteúdo do arquivo. Importante é que usamos um objeto File para realmente abrir um arquivo.