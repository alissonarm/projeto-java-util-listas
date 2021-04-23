package br.com.empresa.projeto.teste.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.empresa.projeto.modelo.Cliente;
import br.com.empresa.projeto.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException {
		
	    Cliente cliente = new Cliente();
	    cliente.setNome("Alisson");
	    cliente.setProfissao("Desenvolvedor");
	    cliente.setCpf("71875896344");
	    
	    ContaCorrente cc = new ContaCorrente(2222, 3333);
	    cc.setTitular(cliente);
	    cc.deposita(150.00);

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

	}

}
