package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaOutrasWrapper {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);         // Autoboxing - Criação do objeto apartir do primitivo
		System.out.println(idadeRef.intValue());        // Unboxing - transforma primitivo em objeto 
		
		Double doubleRef = Double.valueOf(2.9);          // Autoboxing  
		System.out.println(doubleRef.doubleValue());    // Unboxing

		Boolean bRef = Boolean.FALSE;                   // Autoboxing  
		System.out.println(bRef.booleanValue());    // Unboxing
		
		Number refNumero = Float.valueOf(29.8f);
		System.out.println(refNumero);
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.BYTES);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_EXPONENT);
		System.out.println(Float.MIN_NORMAL);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.NaN);
		System.out.println(Float.NEGATIVE_INFINITY);
		System.out.println(Float.POSITIVE_INFINITY);
		System.out.println(Float.SIZE);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(12.4);
		lista.add(25.3f);
		System.out.println(lista);
		
		List referencias = new ArrayList(); //AQUI
		referencias.add(Double.valueOf(30.9));
		referencias.add(Integer.valueOf(10));
		referencias.add(Float.valueOf(13.4f));
		System.out.println(referencias);
		
		

	}

}
