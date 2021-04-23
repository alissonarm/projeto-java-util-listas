package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaInterator {

	public static void main(String[] args) {
//		List<String> nomes = new ArrayList<>();
//		nomes.add("Super Mario");
//		nomes.add("Yoshi"); 
//		nomes.add("Donkey Kong"); 
//
//		Iterator<String> it = nomes.iterator();
//
//		while(it.hasNext()) {
//		  System.out.println(it.next());
//		}
		
		Set<String> nomes = new HashSet<>();
		nomes.add("Super Mario");
		nomes.add("Yoshi"); 
		nomes.add("Donkey Kong"); 

		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
	}

}
