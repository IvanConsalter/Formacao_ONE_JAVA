
public class TesteConta {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		Conta c1 = new Conta();
		c1.deposita(100.0);
		
		Conta c2 = new Conta();
		c2.deposita(100.0);
		
		System.out.println("C1: " + c1.getSaldo());
		System.out.println("C2: " + c2.getSaldo());
		
		c1.transfere(110.0, c2);
	
		System.out.println("C1: " + c1.getSaldo());
		System.out.println("C2: " + c2.getSaldo());
		
	}

}
