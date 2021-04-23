package br.com.empresa.projeto.teste;

import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.ContaPoupanca;
import br.com.empresa.projeto.modelo.Conta;

public class TestaSystem {

	public static void main(String[] args) {

		
		System.out.println(1);
		System.out.println();
		System.out.println("xx");
		System.out.println(true);

		ContaCorrente cc = new ContaCorrente(1, 10);
		ContaPoupanca cp = new ContaPoupanca(1, 2);
				
		System.out.println(cc);
		System.out.println(cc.toString());
		System.out.println(cp);
				
	}

}
