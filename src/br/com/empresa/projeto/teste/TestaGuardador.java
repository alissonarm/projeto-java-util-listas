package br.com.empresa.projeto.teste;

import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.GuardadorDeContas;

public class TestaGuardador {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(10, 12);
		guardador.adiciona(cc);

		Conta cc1 = new ContaCorrente(10, 13);
		guardador.adiciona(cc1);
	
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(2);
		System.out.println(ref);
		System.out.println(ref.getNumero());
		System.out.println(ref.getNumero());
		
		
	}

}
