O Autoboxing / unboxing pode ser confuso. Será que você desmistifica o código abaixo?

public class TesteWrapper {

    public static void main(String[] args){

        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

    }

}

O código compila e roda? Qual seria resultado?

Resposta:

Compila, roda e imprime 4.

Realmente incrementa o valor inteiro, mesmo sendo uma referência. O que acontece por baixo dos panos é um autoboxing / unboxing na linha que incrementa a variável (ref++). Você pode imaginar que essa linha será substituída por três novas:

int valor = ref.intValue();<br>
valor = valor + 1;<br>
ref = Integer.valueOf(valor);<br>

O valor é desembrulhado, depois incrementado e depois embrulhado de novo!