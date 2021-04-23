package br.com.empresa.projeto.modelo;


//FQN -> modelo.CalculadorDeImposto ==> (Full Qualify Name)
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
