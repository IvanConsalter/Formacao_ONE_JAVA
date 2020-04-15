Os generics entraram na versão 1.5 na plataforma Java e foram levemente melhorados no Java 1.7. Quais são os principais benefícios?

Respostas:

1- O código mais legível, já que fica explícito o tipo dos elementos.


Na criação da lista fica claro qual a intenção. Por exemplo, na declaração abaixo está bem claro que a lista guarda Strings:

ArrayList<String> nomes = new ArrayList<String>();

2- Evitar casts excessivos


Uma vez parametrizada a lista, não precisamos mais o cast, por exemplo:

Cliente ref = (Cliente) lista.get(0); // desnecessário com generics


3- Antecipar problemas de casts no momento de compilação.


O compilador avisa se erramos no tipo, por exemplo:

ArrayList<String> lista = new ArrayList<String>(); <br>
lista.add("Nico");<br>
Conta c = lista.get(0); //nao compila