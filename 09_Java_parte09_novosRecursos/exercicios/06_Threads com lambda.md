Considere o seguinte código que executa um Runnable em uma Thread:

new Thread(new Runnable() {

    @Override
    public void run() {
        System.out.println("Executando um Runnable");
    }

}).start();

Como podemos escrevê-lo usando uma expressão lambda?

Resposta:

Seu código deve ficar parecido com:

new Thread(() -> System.out.println("Executando um Runnable")).start();