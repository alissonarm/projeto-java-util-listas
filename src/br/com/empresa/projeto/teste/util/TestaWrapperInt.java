package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaWrapperInt {

	public static void main(String[] args) {

		int[] idades = new int[5]; // array de primitivos 
		String[] nomes = new String[5]; // array de referencias
		
		List nomes2 = new ArrayList(); // ArrayList de referencias - O ArrayList só funciona para referências
        
		
		int idade = 29; // inteiro primitivo 
		
		Integer idadeRef = new Integer(29); //referencia de inteiro - (não é mais utilizado assim).
		// ou
		Integer idadeRef2 = Integer.valueOf(29);// Criação do objeto apartir do primitivo
		
		// transforma o int de referencia em double 
		System.out.println(idadeRef.doubleValue());
		
		
		// constantes da classe Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		
		
		int valor =idadeRef.intValue(); //Criação do primitivo a partir do objeto; 
		
        List<Integer> numeros = new ArrayList();
        numeros.add(idadeRef);
        
        // Autoboxing - aqui o java transforma o primitivo em referencia
        numeros.add(29); 
        
        String s = args[0];

        // Parse - Transforma a string em inteiro
        Integer numero = Integer.valueOf(s);
        int num = Integer.parseInt(s); 
        
        System.out.println(numero);
        System.out.println(num);

	}

}
