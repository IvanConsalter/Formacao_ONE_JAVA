
public class TestaCondicional2 {
	
	public static void main(String[] args) {
		
		 int idade = 16;
         int quantidadePessoas = 3;
         boolean acompanhado = quantidadePessoas >= 2;
         
         System.out.println("acompanhado = " + acompanhado);
         System.out.println("idade >= 18 = " + (idade >= 18));
         System.out.println();
         
         if (idade >=18 && acompanhado){

             System.out.println("Seja bem vindo"); 
         } else {
             System.out.println("infelizmente voce nao pode entrar");
         }
	}
}
