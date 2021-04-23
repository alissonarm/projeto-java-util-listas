package br.com.empresa.projeto.teste;

import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;

public class TesteArrayPrimitivos {

	public static void main(String[] args) {

		// forma classica
		int[] idades = new int[10]; // inicializa o array com zero  
		double precos[] = new double[5];
		
		for (int i=0;i<idades.length;i++) {
			System.out.println(i + " => " + idades[i]);
		}
		
		int idade=0;
		for (int i=0;i<idades.length;i++) {
			idade=idades[i] + i;
			System.out.println(i + " => " + idade);
		}

		for (int i=0;i<5;i++) {
			System.out.println(precos[i]);
		}
		
		// forma literal
		int[] refs = {1,2,3,4,5};
		for (int i=0;i<refs.length;i++) {
			System.out.println(refs[i]);
		}
		

	}

}
