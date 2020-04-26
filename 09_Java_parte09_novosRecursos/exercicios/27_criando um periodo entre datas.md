Como criar um período entre hoje e a data que você criou no exercício anterior?

Para isso temos a classe Period, podemos fazer algo assim:

LocalDate agora = LocalDate.now();

LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

Period periodo = Period.between(agora, dataFutura);

Pesquise a respeito da classe Duration caso queira trabalhar com intervalo de horas.