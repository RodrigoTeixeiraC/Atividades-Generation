package POO;

public class preguica extends animal {
	
	private String alimentacao;
	
	public preguica() {
		
	}
	
	public preguica(String nome, int idade, String som, String acao, String cor, String sela, String alimentacao) {
		super(nome, idade, som, acao);
		this.alimentacao = alimentacao;
	}
	
	@Override
	public void emitirSom () {
		System.out.println("AAAAAAAAAaaaaaaaaaaaa!");
	}
	
	@Override
	public void animalFaz() {
		System.out.println("O animal sobe em arvores");
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	

}
