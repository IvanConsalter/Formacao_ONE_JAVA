package br.com.java8.novosrecursos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TrabalhandoComData {
	
	public static void main(String[] args) {
		
		//mostra a data atual
		LocalDate dataAtual = LocalDate.now();
		System.out.print("Data atual: ");
		System.out.println(dataAtual + "\n");
		
		//define uma data por parametro
		LocalDate dataFutura = LocalDate.of(2099, 1, 25);
		LocalDate dataFutura2 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println("Data definida por paramentro");
		System.out.println(dataFutura + ", " + dataFutura2 + "\n");
		
		//mostra o periodo entre datas sem formatacao
		System.out.println("Mostra o periodo entre datas sem formatacao");
		System.out.println("Periodo entre dataAtual e a dataFutura");
		Period periodo = Period.between(dataAtual, dataFutura);
		System.out.println(periodo + "\n");
		
		System.out.println("Periodo formatado");
		System.out.println(periodo.getDays() + " dias, " + periodo.getMonths() + " meses, " + periodo.getYears() + " anos" + "\n");
		
		//formata uma data pelo parametro passado
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String dataFormatada = formatar.format(dataAtual);
		System.out.println("DataAtual formatada pelo parametro passado");
		System.out.println(dataFormatada);
	}

}
