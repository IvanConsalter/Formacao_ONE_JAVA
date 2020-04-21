Segundo o JavaDoc, um Map também pode ser visto como se fossem de 3 coleções:

The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings.

Ou seja, temos uma coleção de chaves, uma coleção de valores, e uma coleção das associações. O interessante é que podemos acessar cada uma das coleções. Vamos tentar?

No editor abaixo já temos um Map preparado que associa o nome do aluno com a idade.

Para acessar apenas as chaves use o método keySet() do Map. Para acessar os valores existe o método values().

Tente iterar (foreach) em cima das chaves e valores separadamente!

import java.util.*;<br>
import java.util.Map.Entry;<br>

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...
    }

}


Para acessar as chaves devemos executar:

Set<String> chaves = nomesParaIdade.keySet();<br> 
for (String nome : chaves) {<br>
    System.out.println(nome);<br>
}<br>

E para pegar os valores usamos:

Collection<Integer> valores = nomesParaIdade.values();<br>
for (Integer idade : valores) {<br>
    System.out.println(idade);<br>
}<br>

Agora só falta a terceira coleção que devolve a associação. Para tal, existe o método entrySet() e cada associação é representado através da classe Entry:

Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();<br>

Repare que o método devolve um Set de Entry (respire fundo!!). Para acessar essa coleção basta usar o foreach:

Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();<br>    
for (Entry<String, Integer> associacao : associacoes) {<br>
    System.out.println(associacao.getKey() + " - " + associacao.getValue());<br>
}<br>