
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
//		int valor = salario; //nao compila
		int valor = (int) salario;
		System.out.println("casting para int" + valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println("Somando 0.2 + 0.1 = " + total);
		
		//teste tipo float
//		float pontoFlutuante = 3.14; //nao compila
		float pontoFlutuante = 3.14f;
		System.out.println("Ponto Flutuante(float) = " + pontoFlutuante);
	}
}
