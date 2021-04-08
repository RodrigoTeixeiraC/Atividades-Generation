package POO;

public class preguica extends animal {
	
	private String alimentacao;
	
	public preguica(String nome, int idade, String som, String alimentacao) {
		super (nome, idade, som);
		this.alimentacao = alimentacao;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	

}
