package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		//<> Generics
		ArrayList<Conta> lista2 = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		Conta cc = new ContaCorrente(1, 2);
		lista.add(cc);
		
		Conta cc1 = new ContaCorrente(3, 4);
		lista.add(cc1);
	
		System.out.println(lista.size());
		System.out.println(lista.get(0));
		Conta ref = (Conta) lista.get(1); 
		System.out.println(ref.getNumero());
		
		lista.remove(1);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc2 = new ContaCorrente(5, 1);
		lista.add(cc2);
    	Conta cc3 = new ContaCorrente(5, 2);
		lista2.add(cc3);
		Conta cc4 = new ContaCorrente(5, 3);
		lista2.add(cc4);
    	Conta cc5 = new ContaCorrente(5, 4);
		lista2.add(cc5);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("Nova forma --------------------------------------------");
		for(Object o : lista2) {
			System.out.println(o);
		}
		
		
		ArrayList estados = new ArrayList(26); //capacidade inicial
		estados.add("RJ");
		estados.add("SP");
		estados.add("pi");
		//outros estados
		ArrayList nova = new ArrayList(estados); //criando baseado na primeira lista
		System.out.println(nova);
		System.out.println(nova.size());

	}

}
