O Pedro está trabalhando pela primeira vez com o sistema operacional Linux, mas está estranhando, pois, o computador não possui uma interface gráfica (só funciona na linha de comando!).

Ou seja, ele precisa compilar e executar um código Java abaixo na linha de comando, no entanto esqueceu os comandos :(

Arquivo Programa.java:

class Programa {

    public static void main(String[] args) {
        System.out.println("Funcionou!!");
    }
}
Quais comandos ele deve usar para compilar e rodar esse código Java?

Resposta:

javac Programa.java
java Programa

Repare que passamos a extensão do arquivo (.java) para o comando javac:

javac Programa.java

E para chamar a JVM usamos apenas o nome da classe (sem extensão):

java Programa
