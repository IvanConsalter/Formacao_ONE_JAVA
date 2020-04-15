package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
	
	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaPoupanca(11, 22);
		guardador.adiciona(cc2);
		
		int size = guardador.getSize();
		System.out.println("Tamanho do array: " + size);
		
		Conta ref = guardador.getReferencia(0);
		System.out.println("Numero da Conta na posisao 0: " 
							+ ref.getNumero());
		
		
		//usando a classe Object
		Object ref2 = guardador.getReferencia(0);
		int numObject = ((Conta) ref2).getNumero();
		System.out.println("Numero da Conta na posisao 0 com Object: " 
							+ numObject);
		
	}

}
