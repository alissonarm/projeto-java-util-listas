package br.com.empresa.projeto.teste;

import br.com.empresa.projeto.modelo.Cliente;
import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.ContaPoupanca;

public class TesteArrayReferencia {

	public static void main(String[] args) {

		//int[] lista = new int[5]
		ContaCorrente[] contas = new ContaCorrente[5]; // cria as ocorrencias com null  
		
		System.out.println(contas);
		for(int i=0;i<contas.length;i++) {
			System.out.println(contas[i]);
		}

		ContaCorrente cc0 = new ContaCorrente(3477, 7984);
		contas[0] = cc0;
		System.out.println(contas[0]);
		System.out.println(contas[0].getNumero());
		
		ContaCorrente cc1 = new ContaCorrente(3477, 7985);
		contas[1] = cc1;
		System.out.println(contas[1]);
		System.out.println(contas[1].getNumero());

//		System.out.println(contas[3].getNumero()); // java.lang.NullPointerException
//		System.out.println(contas[30].getNumero()); // java.lang.ArrayIndexOutOfBoundsException
		
		ContaCorrente ref = contas[1];
		System.out.println(cc1.getNumero());
		System.out.println(ref.getNumero());

		
		Conta[] contas10 = new Conta[5]; // cria as ocorrencias com null
		ContaCorrente cc10 = new ContaCorrente(347, 798);
		ContaPoupanca cp10 = new ContaPoupanca(347, 798);
		
		contas10[0] = cc10;
		contas10[1] = cp10;
		
		Conta ref2 = contas10[1];
		ContaPoupanca ref3 = (ContaPoupanca) contas10[1]; //type cast
		// ContaCorrente ref4 = (ContaCorrente) contas10[1]; ==> java.lang.ClassCastException pois nesta posição não é a conta corrente e sim a poupanca
		System.out.println(cc10.getNumero());
		System.out.println(ref2.getNumero());
		System.out.println(ref3.getNumero());
		
//		Cliente clienteNormal = new Cliente();
//		clienteNormal.setNome("Flavio");
//
//		Cliente clienteVip = new Cliente();
//		clienteVip.setNome("Romulo");
//
//		Object[] refs = new Object[5];
//		refs[0]  = clienteNormal;
//		refs[1]  = clienteVip;
//
//		System.out.println( (Cliente) refs[1].getNome() );

		
		
	}

}
