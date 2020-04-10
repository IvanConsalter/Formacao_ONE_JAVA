
public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		
		for (int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
		
		System.out.println("---------------------------------");
		
		//outro metodo
		
		for (int linha = 0; linha < 10; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
