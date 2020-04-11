
public class TestaCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
//		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.setTitular(new Cliente()); 
		
//		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.getTitular().setNome("Marcela");
		
//		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.getTitular().getNome());
	
	}

}
