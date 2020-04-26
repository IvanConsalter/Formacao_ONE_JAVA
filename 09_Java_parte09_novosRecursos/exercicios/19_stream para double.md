Qual é a versão de Stream para o tipo primitivo double?

Resposta:

DoubleStream

Você também pode representar utilizando um Stream<Double>,

Mas isso vai forçar o autoboxing dos doubles (para o tipo Double) . Isto é, utilizará mais recursos da JVM.