
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
//		Funcionario nico = new Funcionario(); //depois da classe funcionario
//		//virar abstract, nao compila
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("123456789");
		nico.setSalario(2590.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
