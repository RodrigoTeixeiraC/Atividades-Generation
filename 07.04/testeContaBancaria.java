package POO;

import java.util.Scanner;

public class testeContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0; 
		float d, s;
		
		contaBancaria conta = new contaBancaria("Rodrigo Teixeira",1,2,100000);
		Scanner leia = new Scanner(System.in);
		
		while(x != 4) {
			System.out.println("Escolha uma opção:\n1- Consultar saldo\n2- Fazer depósito\n3- Fazer saque\n4- Finalizar programa");
			x = leia.nextInt();
			
			switch(x) {
			case 1: 
				conta.consultarSaldo();
				break;
			case 2:
				System.out.println("Qual valor deseja depositar?");
				d = leia.nextFloat();
				conta.deposito(d);
				break;
			case 3:
				System.out.println("Qual valor deseja sacar?");
				s = leia.nextFloat();
				conta.saque(s);
				break;
			case 4:
				x = 4;
				break;
				
			default:
				System.out.println("Não existe essa opção digite novamente!");
				break;
			}
			
		}

	}

}
