
public class TestaCondicional {
	
	public static void main(String[] args) {
	
		int idade = 18;
		int quantidadePessoas = 3;
		
		if(idade >= 18) {
			System.out.println("Voc� tem mais que 18 anos");
            System.out.println("Seja bem vindo");
		}else if(quantidadePessoas >= 2) {
			System.out.println("voce nao tem 18, mas pode entrar,"
					+ " pois est� acompanhado");
		}else {
			System.out.println("Infelizmente voce nao pode entrar");
		}
	}
}
