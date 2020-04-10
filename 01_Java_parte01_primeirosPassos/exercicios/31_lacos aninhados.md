Após assistir as aulas de aninhamento de laços de repetição e sobre o comando break, Fernando decidiu criar um código como forma de treinamento que imprime na tela o seguinte:

1<br>
12<br>
123<br>
1234<br>
12345<br>

Para isso, ele criou o seguinte código.

public class ProgramaComBreak {

    public static void main(String args[]) {

        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( ??? ) {
                    break;
                }
                System.out.print( ??? );
            }
            System.out.println();
        }

    }

}

No entanto, ele está em dúvida sobre como deve preencher os espaços com ???. Selecione a opção que mostra respectivamente as formas corretas de preenchimento do código. Se tiver com dúvida, faça o teste e execute o programa.

Resposta:

coluna > linha e coluna+1

Observe que precisamos adicionar 1 ao valor da coluna pois o for está inicializando essa variável com o valor 0.
