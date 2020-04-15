Veja o código a seguir.

Character cRef = new Character('A');

Qual é o tipo primitivo desse wrapper?

Resposta:

char

O interessante é que o char é quase um tipo numérico. Ele tem dois bytes, igual o tipo short mas não usa o primeiro bit para guardar o sinal. Em outras palavras, o char só guarda números positivos. Isso significa que o char consegue guardar valores entre 0 e 65536 (2^16).