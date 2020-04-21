package br.com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaTreeSet {
	
	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Barney", 22);
		Funcionario f2 = new Funcionario("Jonathan", 32);
		Funcionario f3 = new Funcionario("Bernado", 28);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		
		Iterator<Funcionario> iterador = funcionarios.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next().getIdade());
		}
	}

}


