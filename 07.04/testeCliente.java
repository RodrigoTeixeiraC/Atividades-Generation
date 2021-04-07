package POO;

import java.util.Scanner;

public class testeCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, idade, genero;
		float valorCompra;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o nome do cliente: ");		
		nome = leia.next();
		
		System.out.println("Entre com a idade do cliente: ");		
		idade = leia.next();
		
		System.out.println("Entre com o sexo do cliente: ");		
		genero = leia.next();
		
		System.out.println("Entre com o valor da compra: ");		
		valorCompra = leia.nextFloat();
		
		cliente cliente1 = new cliente(nome, idade, genero, valorCompra);
		
		if(valorCompra>999) {
			cliente1.imprimirInfo();
			cliente1.descontoCompra(10);
			System.out.println("Já que a compra foi acima de R$999,00 o cliente teve desconto de 10% e deve pagar " +  cliente1.formatarMoeda());
		}
		
		else{cliente1.imprimirInfo();}

	}

}
