package br.com.bytebank.banco.test;

public class TesteArrayPrimitivos {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		idades[0] = 29;
		idades[1] = 32;
		idades[2] = 18;
		idades[3] = 54;
		idades[4] = 48;
		
		
		int idade5 = idades[3];
		
		System.out.println(idade5);
		System.out.println("\n------------------------------");
		
		System.out.println(idades[3]);
		System.out.println("\n------------------------------");
		
		System.out.println("Tamanho do array: " + idades.length);
		System.out.println("\n------------------------------");
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i + i;
			System.out.println(idades[i]);
		}
		
		System.out.println("\n------------------------------");
		//outro metodo de criar um array
		int[] refs = {1,2,3,4,5};
		
		for(int i = 0; i < refs.length; i++) {
			System.out.println(refs[i]);
		}
		
		
	}

}
