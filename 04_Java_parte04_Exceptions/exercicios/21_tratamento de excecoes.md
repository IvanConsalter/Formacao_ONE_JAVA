A equipe de desenvolvedores decidiu criar duas exceções para trabalhar com contas:

public class SacaException extends RuntimeException {
}

e

public class DepositaException extends RuntimeException {
}


Conhecendo as duas exceções, você precisa fazer um tratamento. Das opções abaixo, quais são as válidas (que compilam)?

Resposta:

try {}<br>
finally {}<br>

No tratamento o bloco catch é opcional quando tem o bloco finally.