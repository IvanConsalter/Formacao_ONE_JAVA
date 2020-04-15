package br.com.bytebank.banco.test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteVector {
	
	public static void main(String[] args) {
		
//		List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
//		List<Conta> lista = new LinkedList<Conta>(); //lista linkada
//		List<Conta> lista = new Vector<Conta>(); // usa array por baixo, mas tbm é threadsafe
		Collection<Conta> lista = new Vector<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 33);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		System.out.println("----------------");
		
		Conta cc3 = new ContaCorrente(33, 44);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(44, 55);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);// com Collection nao compila, precisa de Cast
			Object oRef = ((Vector<Conta>) lista).get(i);
			System.out.println(oRef);
		}
		
		System.out.println("----------------");
		
		//usando foreach
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
