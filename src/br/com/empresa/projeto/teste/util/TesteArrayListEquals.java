package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		//<> Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
	
		Conta cc = new ContaCorrente(1, 2);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(3, 4);
		lista.add(cc1);
	
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		System.out.println("---------------------------------------------");
		
		boolean existe = lista.contains(cc1);
		System.out.println("Já existe na lista? " + existe);
		existe = lista.contains(cc);
		System.out.println("Já existe na lista? " + existe);
		

		// o metodo contais utiliza o metodo equals que foi sobrescrito na classe Conta. O metodo equals agora compara os valores;
		Conta cc2 = new ContaCorrente(3, 4);
		existe = lista.contains(cc2);
		System.out.println("Já existe ? " + existe);
				
//		// == compara referencias
//		for(Conta conta : lista) {
//			if (conta == cc2) {
//				System.out.println("==> Já tenho esta referencia");
//				break;
//			}
//		}

	}

}
