Mude o seu comparator usando algum outro critério de comparação no lugar do tamanho(length) da String.

Uma forma seria utilizar o String.CASE_INSENSITIVE_ORDER:

palavras.sort(String.CASE_INSENSITIVE_ORDER);