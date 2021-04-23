package br.com.empresa.projeto.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.empresa.projeto.modelo.Cliente;
import br.com.empresa.projeto.modelo.Conta;
import br.com.empresa.projeto.modelo.ContaCorrente;
import br.com.empresa.projeto.modelo.ContaPoupanca;

public class TestaOrdenaString {

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

// 1)    Ordem natural - Ela é definida na classe Conta através do método compareTo(no caso escolhemos o saldo)	      
//       Collections.sort(lista); 
       
// 2)   Collections.reverse(lista); //inverte a ordem da lista       
       
// 3)   Collections.shuffle(lista); // Embaralhar a lista
       
// 4)    Collections.rotate(lista, 5); //rotacionar 5 posicoes       
       
// 2)    Ordenação através da classe Collections        
//       Collections.sort(lista, new OrdenaTitular());
       
//  3)   Ordenação armazenando a referencia em compara     
//       OrdenaTitular compara = new OrdenaTitular();
//       lista.sort(compara);
       
//  4)   Ordenação sem armazenar a referencia, chamando direto        
//       lista.sort(new OrdenaTitular());        

//  5)   Ordem natural - Uma vez definido o método na classe, pela lista também faz:
         lista.sort(null);
              
     
       
       System.out.println("=========================");
          
       for (Conta conta2 : lista) {
      	  System.out.println(conta2 + " , " + conta2.getTitular().getNome());
       }
    }    
}

   class OrdenaTitular implements Comparator<Conta> {

		@Override
		public int compare(Conta o1, Conta o2) {

			String nomeCli1 = o1.getTitular().getNome();
			String nomeCli2 = o2.getTitular().getNome();
			return nomeCli1.compareTo(nomeCli2);			
            // O método compareTo retorna: 
			// Se nomeCli1 < nomeCli2 ==>  valor negativo(-1)
			// Se nomeCli1 > nomeCli2 ==>  valor positivo(1)
			// Se nomeCli1 = nomeCli2 ==>  valor zero 
			
		}
		
	}
   