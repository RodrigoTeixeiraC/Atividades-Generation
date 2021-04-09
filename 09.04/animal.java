package POO;

public abstract class animal {
	
	private String nome;
	private int idade;
	private String som;
	private String acao;
	
	//método construtor
	
	public animal() {
		
	}
	
	public animal(String nome, int idade, String som, String acao) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}
	
	abstract public void emitirSom();
	
	abstract public void animalFaz();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}
	
	

}
