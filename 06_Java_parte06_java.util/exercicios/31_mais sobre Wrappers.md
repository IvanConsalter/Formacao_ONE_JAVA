Você está querendo ajudar o Pedro que está trabalhando com Java mas nunca aprendeu os generics. Ele te mostrou o código abaixo:

List referencias = new ArrayList(); //AQUI<br>
referencias.add(Double.valueOf(30.9));<br>
referencias.add(Integer.valueOf(10));<br>
referencias.add(Float.valueOf(13.4f));<br>

Com qual código você pode substituir a linha com o comentário //AQUI para usar generics?

Respostas:

1- List<Object> referencias = new ArrayList<>();


Todas as referências também são Objects.


2- List<Number> referencias = new ArrayList<>();


Todos os elementos dessa lista são números.