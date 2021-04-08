package POO;

public class cavalo extends animal{
	
	private String cor;
	private String sela;
	
	public cavalo(String nome, int idade, String som, String cor, String sela) {
		super(nome, idade, som);
		this.cor = cor;
		this.sela = sela;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSela() {
		return sela;
	}

	public void setSela(String sela) {
		this.sela = sela;
	}
	
	

}
