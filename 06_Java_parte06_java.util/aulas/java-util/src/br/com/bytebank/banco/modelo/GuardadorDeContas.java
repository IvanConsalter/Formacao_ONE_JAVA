package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int contador;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.contador = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[this.contador] = ref;
		this.contador++;		
	}

	public int getSize() {
		return this.contador;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
