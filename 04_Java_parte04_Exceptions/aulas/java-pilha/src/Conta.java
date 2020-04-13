
public class Conta {

	private int saldo;

	void deposita() throws MinhaExcecao{}
	
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public void deposita(double valor) {
		this.saldo += valor;	
	}
	
	public int getSaldo() {
		return saldo;
	}
	
}
