Crie um LocalDate para representar o dia 25 de Janeiro de 2099.

Que método você utilizou pra fazer isso? Quais outras opções você tinha?

Uma alternativa é utilizar o método of, da seguinte forma:

LocalDate data = LocalDate.of(2099, 1, 25);

Você ainda pode utilizar um enum pra representar o mês:

LocalDate data = LocalDate.of(2099, Month.JANUARY, 25);