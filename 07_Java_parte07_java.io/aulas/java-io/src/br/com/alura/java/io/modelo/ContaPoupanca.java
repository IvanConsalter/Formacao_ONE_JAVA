package br.com.alura.java.io.modelo;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "Tipo: Conta-Poupança-> " + super.toString();
	}

	@Override
	public int compareTo(Conta cp) {
		return Double.compare(this.saldo, cp.saldo);
	}
}
