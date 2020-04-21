Vimos que para adicionar um elemento em uma lista ou conjunto, utilizamos o método add. Mas por não implementar a interface Collection, ele não possui este método add. Qual método utilizamos para adicionar um elemento em um Map?

Resposta:

put


O método utilizado para adicionar um elemento em um Map é o método put. Ele recebe dois parâmetros, a chave e o valor. Os tipos desses parâmetros dependem do que definimos na hora da instância do objeto. Por exemplo, abaixo criamos um Map que recebe como chave a matrícula do aluno e como valor o seu nome:

Map<Integer, String> matriculaParaAluno = new HashMap<>();<br>
matriculaParaAluno.put(123456, "Leonardo Cordeiro");<br>
Então no put, nós temos que receber como parâmetro um inteiro, que representa a matrícula, e uma String, que representa o nome do aluno.