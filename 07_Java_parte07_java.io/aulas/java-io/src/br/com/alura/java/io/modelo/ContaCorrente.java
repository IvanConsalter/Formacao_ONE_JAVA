package br.com.alura.java.io.modelo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2; //taxa de 20 cents para saque
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Tipo: Conta-Corrente-> " + super.toString();
	}

	@Override
	public int compareTo(Conta cc) {
		return Double.compare(this.saldo, cc.saldo);
	}
	

}
