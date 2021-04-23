package br.com.empresa.projeto.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int i;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.i = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[i] = ref;
		i++;
	}

	public int getQuantidadeDeElementos() {
		return this.i;
	}

	public Conta getReferencias(int pos) {
		return this.referencias[pos];
	}
	

}
