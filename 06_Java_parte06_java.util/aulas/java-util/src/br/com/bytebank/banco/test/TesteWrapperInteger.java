package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		Integer idadeRef = 29; 
		//autoboxing, é criado um objeto do tipo Integer
		
		int primitivo = new Integer(21);
		// unboxing
		
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(idadeRef); //ok
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //unboxing
		Integer i2 = lista.get(1); //ok
		
		System.out.println("Integer");
		System.out.println(i1); //29
		System.out.println(i2); //21
		
		System.out.println("\nvalueOf() e intValue()");
		Integer valorRef = Integer.valueOf(33);	//delegando criacao para metodo valueOf
		int valorPri = valorRef.intValue();	
		//desembrulhando, pegando o valor primitivo do objeto wrapper
		
		System.out.println(valorPri); //33
		
		System.out.println("\nParsing");
		Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo referencia
		int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo
		
		System.out.println("tipo: " + iParseado1.TYPE + ", valor: " + iParseado1);
		System.out.println("String parseado para int: " + iParseado2);
		
		System.out.println("\nConstantes da classe Integer");
		System.out.println(Integer.MAX_VALUE); // 2^31 - 1
		System.out.println(Integer.MIN_VALUE); //-2^31

		System.out.println(Integer.SIZE); // 32 bits
		System.out.println(Integer.BYTES); //4 Bytes
	}

}
