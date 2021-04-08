package POO;

public class cachorro extends animal {
	
	private String raca;
	private String porte;
	
	public  cachorro(String nome, int idade,String som, String raca, String porte) {
		super(nome, idade, som);
		this.raca = raca;
		this.porte = porte;
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
