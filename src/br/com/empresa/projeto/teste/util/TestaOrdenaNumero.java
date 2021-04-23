package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.ContaPoupanca;

public class TestaOrdenaNumero {

   public static void main(String[] args) {

          Conta cc1 = new ContaCorrente(22, 33);
          cc1.deposita(333.0);
          Conta cc2 = new ContaPoupanca(22, 44);
          cc2.deposita(444.0);
          Conta cc3 = new ContaCorrente(22, 11);	
          cc3.deposita(111.0);
          Conta cc4 = new ContaPoupanca(22, 22);
          cc4.deposita(222.0);

          List<Conta> lista = new ArrayList<>();
          lista.add(cc1);
          lista.add(cc2);
          lista.add(cc3);
          lista.add(cc4);

          for (Conta conta : lista) {
       	      System.out.println(conta);
          }    
          
//          SortNumero compara = 
//          lista.sort(compara);
// outra opção para chamada do método sort
            lista.sort(new SortNumero());
          
          System.out.println("=========================");
          
          for (Conta conta2 : lista) {
        	  System.out.println(conta2);
		  }
    }    
}

   class SortNumero implements Comparator<Conta> {

		@Override
		public int compare(Conta o1, Conta o2) {
//			if (o1.getNumero() < o2.getNumero()) {
//				return -1;
//			}
//			if (o1.getNumero() > o2.getNumero()) {
//				return 1;
//			}
//			return 0;
// simplificando o código acima
//			return o1.getNumero() - o2.getNumero();
// Outra opção é utilizar o método
			return Integer.compare(o1.getNumero(), o2.getNumero());
			
		}
		
	}
   