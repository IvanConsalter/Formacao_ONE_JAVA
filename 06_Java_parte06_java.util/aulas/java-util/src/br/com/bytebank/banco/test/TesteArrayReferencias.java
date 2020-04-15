package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta [] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 22);
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(11, 11);
		contas[1] = cc2;
		
		System.out.println("Acessando por indice");
		System.out.println("Numero cc1: " + contas[0].getNumero());
		System.out.println("Numero cc2: " + contas[1].getNumero());
		
		ContaCorrente ref = (ContaCorrente) contas[0];
//		ContaPoupanca ref2 = contas[1]; //nao compila precisa fazer cast
		
		System.out.println("\nAcessando por referencias");
		System.out.println("Numero cc2: " + cc2.getNumero());
		System.out.println("Numero cc1: " + ref.getNumero());
		
	}

}
