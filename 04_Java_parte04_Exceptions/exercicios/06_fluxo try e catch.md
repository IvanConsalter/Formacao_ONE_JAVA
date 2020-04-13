Temos o seguinte código que faz uso dos blocos try e catch:

public class Principal {

    public static void main(String[] args) {

        String nome = "Alura";
        System.out.println("ANTES");

        try {
            System.out.println(nome);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("CATCH");
        }

        System.out.println("DEPOIS");

    }

}


Sobre a saída do código, marque a opção verdadeira:

Resposta:

Saída:

ANTES<br>
Alura<br>
DEPOIS<br>

Nenhum erro acontecerá e por isso a condição catch não será chamada.