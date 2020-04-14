Veja o código:

public class TesteString {

    public static void main(String[] args) {

        String nome = "Mario";
        nome.replace('o', 'a');
        System.out.println(nome);

    }

}

Ao compilar e rodar, qual é o resultado?

Obs: Se tiver com dúvidas, pode testar no Eclipse, claro.

Resposta:

O código compila e roda. O resultado é:

Mario
O método replace não altera a String original e sim devolve uma nova String. Para contemplar a alteração devemos pegar o resultado do método replace:

String nome = "Mario";<br>
nome = nome.replace('o', 'a');<br>
System.out.println(nome);<br>