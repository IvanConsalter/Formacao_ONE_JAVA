Veja a estrutura seguinte:

src<br>
  br<br>
    gov<br>
      rio<br>
        sicis<br>
          Usuario.java<br>

E o código fonte da classe Usuario:

//AQUI

public class Usuario {

  //atributos e métodos omitidos

}

Assume que a pasta src é a raiz do nosso código fonte. O que devemos colocar no lugar de //AQUI para compilar a classe Usuario com sucesso?

Resposta:

package br.gov.rio.sicis;


O package possui todos os nomes dos diretórios separado pelo caracter . (ponto).