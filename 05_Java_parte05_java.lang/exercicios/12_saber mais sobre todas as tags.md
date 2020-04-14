Já vimos nessa aula algumas tags (ou anotações) do javadoc como @version ou @author. Segue a lista completa:

@author (usado na classe ou interface)<br>
@version (usado na classe ou interface)<br>
@param (usado no método e construtor)<br>
@return (usado apenas no método)<br>
@exception ou @throws (no método ou construtor)<br>
@see<br>
@since<br>
@serial<br>
@deprecated<br>


Importante é que as tags do javadoc existem apenas para padronizar alguns dados fundamentais do seu código fonte como o autor e a versão.

Nos cursos você também já viu uma anotação fora do javadoc, a anotação @Override. Essa anotação é considerada uma configuração, nesse caso interpretado pelo compilador.

As anotações vão muito além das tags javadoc e são muito mais sofisticadas e poderosas. Elas só entraram na plataforma Java a partir da versão 1.5 enquanto o javadoc está presente desde o nascimento da plataforma Java. O interessante é que as anotações foram inspirados pelas tags do javadoc.

Se você ainda não está seguro sobre o uso das anotações, fique tranquilo pois você verá ainda muitas usadas pelas bibliotecas por ai para definir dados e configurações. 