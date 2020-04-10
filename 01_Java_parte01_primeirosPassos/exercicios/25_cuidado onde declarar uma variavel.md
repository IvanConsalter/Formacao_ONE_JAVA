Dessa vez, João fez uma implementação para calcular o salário de um funcionário em caso de promoção. Ele fez a seguinte implementação:

public class TesteSalario {

    public static void main(String[] args) {

        boolean foiPromovido = true;

        if(foiPromovido) {
            double salario = 4200.0;
        } else {
            double salario = 3800.0;
        }

        System.out.println(salario);
    }
}

Qual será o resultado da compilação/execução?

Resposta:

O código nem compila, pois fora do bloco if/else a variável salario não existe mais.

A variável salario só é visível dentro do bloco if/else.