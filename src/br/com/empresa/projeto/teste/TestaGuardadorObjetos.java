package br.com.empresa.projeto.teste;

import br.com.empresa.projeto.modelo.Cliente;
import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.GuardadorDeContas;
import br.com.empresa.projeto.modelo.GuardadorDeObjetos;

public class TestaGuardadorObjetos {

	public static void main(String[] args) {
		
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		
		Conta cc = new ContaCorrente(10, 12);
		guardador.adiciona(cc);

		Conta cc1 = new ContaCorrente(10, 13);
		guardador.adiciona(cc1);

		Cliente cli = new Cliente();
		guardador.adiciona(cli);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Object ref = guardador.getReferencias(1);
		System.out.println(ref);
		System.out.println(((Conta) ref).getNumero());
//		System.out.println(ref.getNumero());
		
		
	}

}
