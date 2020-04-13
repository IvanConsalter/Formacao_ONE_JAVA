
public class Fluxo {
	
	public static void main(String[] args) throws MinhaExcecao {
		
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (Exception ex) { //catch generico, capturando qualquer excecao
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
		
	}
	
	private static void metodo1() throws MinhaExcecao{
		
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo2");
		
	}
	
	private static void metodo2() throws MinhaExcecao{
		
		System.out.println("Inicio do metodo2");
		MinhaExcecao exception = new MinhaExcecao("Deu muito errado");
		throw exception;
		//outro metodo
//		throw new ArithmeticException("Deu erro");
		//System.out.println("Fim do metodo2");
	}

}
