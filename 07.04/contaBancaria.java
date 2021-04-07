package POO;

import java.text.NumberFormat;

public class contaBancaria {
	
	private String nomeProprietario;
	private int conta;
	private int agencia;
	private float saldo;
	
	
	public contaBancaria(String nomeProprietario, int conta, int agencia, float saldo) {
		this.nomeProprietario = nomeProprietario;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public String formatarSaldo() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMaximumFractionDigits(2);
		String formatarSaldo = nf.format(saldo);
		return formatarSaldo;
	}
	
	public void consultarSaldo() {
		System.out.println("O Saldo atual é: "+this.formatarSaldo());
	}
	
	public void deposito(float deposito) {
		saldo = saldo + deposito;
	}
	
	public void saque(float saque) {
		if(saldo>=saque) {
			saldo = saldo - saque;
		}
		else {
			System.out.println("Não possui saldo suficiente para fazer esas operação!");
		}
	}


	public String getNomeProprietario() {
		return nomeProprietario;
	}


	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	

}
