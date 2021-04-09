package POO;

public class cavalo extends animal{
	
	private String cor;
	private String sela;
	
	public cavalo() {
		
	}
	
	public cavalo(String nome, int idade, String som, String acao, String cor, String sela) {
		super(nome, idade, som, acao);
		this.cor = cor;
		this.sela = sela;
	}
	
	@Override
	public void emitirSom () {
		System.out.println("Iirrirrirri Iirrirri!");
	}
	
	@Override
	public void animalFaz() {
		System.out.println("O animal corre");
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
