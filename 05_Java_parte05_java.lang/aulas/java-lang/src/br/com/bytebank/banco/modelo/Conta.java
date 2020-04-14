package br.com.bytebank.banco.modelo;

public abstract class Conta {

	private int agencia;
	private int numero;
	private Cliente titular;
	protected double saldo;
	private static int total = 0;
	
	public Conta() {
		System.out.println("Criando uma Conta");
	}
	
	/**
	 * Construtor para inicializar o objeto Conta
	 * a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de Contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma Conta");
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @return
	 */
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		
		return false;
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
}
