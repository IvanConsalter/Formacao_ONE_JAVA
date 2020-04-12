Quais foram os problemas apresentados na implementação da classe Funcionario?

Obs: Esses problemas no código ou design também são chamados de Code Smells (mau cheiro no código). Existe um livro famoso Clean Code, do autor Robert C Martin, que ficou famoso pois mostra os Code Smells e como resolvê-los. O livro já é um pouco antigo, mas vale a leitura.


Quais foram os problemas apresentados?

Resposta:

1- Repetição de código


Muito provável que precisaremos repetir o if em outros pontos de código.


2- Muitos ifs que nunca param de crescer


Para cada novo tipo de funcionário é preciso adicionar uma nova condição no if.


3- Código pouco expressivo


Por exemplo, qual tipo de funcionário representa o valor 0?