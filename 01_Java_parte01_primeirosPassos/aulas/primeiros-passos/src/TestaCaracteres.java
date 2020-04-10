
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a'; //precisa ser aspas simples
		System.out.println(letra);
		
		char valor = 65; //unicode
		System.out.println(valor); //saida = A
	
//		valor = valor + 1; //nao compila
		valor = (char)(valor + 1);
		System.out.println(valor); //saida = B
		
		String palavra = "alura cursos online de tecnologia ";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
