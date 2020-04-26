Crie um formatador para o pattern dd/MM/yyyy e imprima a data de hoje formatada.

Uma alternativa é utilizar o DateTimeFormatter da seguinte forma:

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

String dataFormatada = formatter.format(agora);