package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
}
