package POO;

public class cachorro extends animal  {
	
	private String raca;
	private String porte;
	
	public cachorro() {
		
	}
	
	public  cachorro(String nome, int idade,String som, String raca, String acao, String porte) {
		super(nome, idade, som, acao);
		this.raca = raca;
		this.porte = porte;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au au au au!");
	}
	
	@Override
	public void animalFaz() {
		System.out.println("O animal corre");
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	

}
