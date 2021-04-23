package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.empresa.projeto.modelo.Cliente;
import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.ContaPoupanca;

public class TestaClasseAnonima {

   public static void main(String[] args) {

       Conta cc1 = new ContaCorrente(22, 33);
       Cliente clienteCC1 = new Cliente();
       clienteCC1.setNome("Nico");
       cc1.setTitular(clienteCC1);
       cc1.deposita(333.0);

       Conta cc2 = new ContaPoupanca(22, 44);
       Cliente clienteCC2 = new Cliente();
       clienteCC2.setNome("Guilherme");
       cc2.setTitular(clienteCC2);
       cc2.deposita(444.0);

       Conta cc3 = new ContaCorrente(22, 11);
       Cliente clienteCC3 = new Cliente();
       clienteCC3.setNome("Paulo");
       cc3.setTitular(clienteCC3);
       cc3.deposita(111.0);

       Conta cc4 = new ContaPoupanca(22, 22);
       Cliente clienteCC4 = new Cliente();
       clienteCC4.setNome("Ana");
       cc4.setTitular(clienteCC4);
       cc4.deposita(222.0);
       
       Conta cc5 = new ContaPoupanca(10, 12);
       Cliente clienteCC5 = new Cliente();
       clienteCC5.setNome("Patricia");
       cc5.setTitular(clienteCC5);
       cc5.deposita(222.4);

       Conta cc6 = new ContaPoupanca(12, 12);
       Cliente clienteCC6 = new Cliente();
       clienteCC6.setNome("Ana Lucia");
       cc6.setTitular(clienteCC6);
       cc6.deposita(22.4);
       
       List<Conta> lista = new ArrayList<>();
       lista.add(cc1);
       lista.add(cc2);
       lista.add(cc3);
       lista.add(cc4);
       lista.add(cc5);
       lista.add(cc6);

       for (Conta conta : lista) {
   	      System.out.println(conta);
       }    


       lista.sort(new Comparator<Conta>() { //classe anônima
 
     		@Override
     		public int compare(Conta o1, Conta o2) {
   	      		return Integer.compare(o1.getNumero(), o2.getNumero());
     		}	
   		});
       
       System.out.println("=========================");
          
       for (Conta conta2 : lista) {
      	  System.out.println(conta2 + " , " + conta2.getTitular().getNome());
       }
       
       Comparator<Conta> comp = new Comparator<Conta>() { //classe anônimas

   		@Override
   		public int compare(Conta o1, Conta o2) {

   			String nomeCli1 = o1.getTitular().getNome();
   			String nomeCli2 = o2.getTitular().getNome();
   			return nomeCli1.compareTo(nomeCli2);			
   		
   		}
   	};
       
    }    
}

