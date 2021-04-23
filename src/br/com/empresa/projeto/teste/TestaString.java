package br.com.empresa.projeto.teste;

import java.util.Iterator;

public class TestaString {

	public static void main(String[] args) {

		char A = 'A';
		char a = 'a';
		
		String nomeVazio = "";
		
		String espacos = "                e s p a c o s ";
		String novoEspaco = espacos.trim();
		
		String nome = "Alura";
		String outro = nome.replace("A", "a");
		String outro2 = nome.toLowerCase();
		
		String outro3 = nome.replace(A, a);
		
		char letra =  nome.charAt(2);
		char letra0 =  nome.charAt(0);
		
		int pos = nome.indexOf("ur");
		
		String sub = nome.substring(1);

		System.out.println(outro);
		System.out.println(outro2);
		System.out.println(outro3);
		System.out.println(letra);
		System.out.println(letra0);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		System.out.println("Vazio? " + nome.isEmpty());
		System.out.println("Vazio? " + nomeVazio.isEmpty());
		System.out.println(espacos);
		System.out.println(novoEspaco);
		System.out.println(espacos.contains("p a"));
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto2 = builder.toString();
		System.out.println(texto2);
		
		String nomeA = "ALURA";
		CharSequence cs = new StringBuilder("al");

		nomeA = nomeA.replace("AL", cs);

		System.out.println(nomeA);
		
	}

}
