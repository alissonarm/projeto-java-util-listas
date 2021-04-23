package br.com.empresa.projeto.modelo;

public class GuardadorDeObjetos {
	
	private Object[] referencias;
	private int i;
	
	public GuardadorDeObjetos() {
		this.referencias = new Object[10];
		this.i = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[i] = ref;
		i++;
	}

	public int getQuantidadeDeElementos() {
		return this.i;
	}

	public Object getReferencias(int pos) {
		return this.referencias[pos];
	}
	

}
