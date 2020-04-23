Considere a seguinte expressão lambda:

Function<Usuario, String> funcao = u -> u.getNome();
Como podemos escrever essa função com method reference?

Resposta:

Usuario::getNome

Usuario::getNome. Nosso código fica assim:

Function<Usuario, String> funcao = Usuario::getNome;