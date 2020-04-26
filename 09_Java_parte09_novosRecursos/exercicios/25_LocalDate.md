Crie uma nova classe com um método main para escrever seus exercícios com datas.

Nessa classe imprima a data atual utilizando a classe LocalDate.

O código pode ficar assim:

public class Datas {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        System.out.println(agora);

    }
}