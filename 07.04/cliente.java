package POO;

import java.text.NumberFormat;

public class cliente {
	
	private String nomeCliente;
	private String idade;
	private String genero;
	private float valorCompra;
	
	
	//método construtor
	
	public cliente(String nomeCliente, String idade, String sexo, float valorCompra) {
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.genero = genero;
		this.valorCompra = valorCompra;
	}
	
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatarMoeda = nf.format(valorCompra);
		return formatarMoeda;
	}
	
	public void imprimirInfo() {
		System.out.println("O cliente "+nomeCliente+" tem "+idade+" e fez uma compra de "+this.formatarMoeda());
		
	}
	
	public void descontoCompra(float percentual) {
		valorCompra = valorCompra - (valorCompra*(percentual/100));
	}

	// Get e Set
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getIdade() {
		return idade;
	}


	public void setIdade(String idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return genero;
	}


	public void setSexo(String sexo) {
		this.genero = sexo;
	}


	public float getValorCompra() {
		return valorCompra;
	}


	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	

}
