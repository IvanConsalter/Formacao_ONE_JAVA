Você encontrou um código legado que ainda não usa generics:

ArrayList lista = new ArrayList();<br>
Cliente cliente = new Cliente();<br>
lista.add(cliente);<br>

Como você pode melhorar o código e aplicar os generics?

ArrayList<Cliente> lista = new ArrayList<Cliente>();


Parametrizamos a ArrayList usando <>. Há uma variação/simplificação que entrou no Java 1.7. O código abaixo é equivalente a alternativa:

ArrayList<Cliente> lista = new ArrayList<>();