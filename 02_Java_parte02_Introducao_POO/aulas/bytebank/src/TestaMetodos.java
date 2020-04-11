
public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.deposita(500.0);
		c1.transfere(250.0, c2);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		c1.saca(100.0);
		c2.saca(100.0);
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}
}
