package Turma20;

import java.util.Scanner;

public class Exerciciosdia2503 {
	
	public static void main(String[] args) {
		
		//Exerc�cio 1
		
				
		float x1, x2, x3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		x1 = ler.nextFloat();
		
		System.out.println("Entre com um n�mero:");
		x2 = ler.nextFloat();
		
		System.out.println("Entre com um n�mero:");
		x3 = ler.nextFloat();
		
		
		if(x1>x2 && x1>x3) {
			System.out.println("O maior n�mero � "+x1);
		}
		
		else if(x2>x1 && x2>x3){
			System.out.println("O maior n�mero � "+x2);
		}
		
		else{
			System.out.println("O maior n�mero � "+x3);
		}
		
		
		
		
		//Exercicio 2
		float n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com um n�mero:");
		n2 = leia.nextFloat();
		
		System.out.println("Entre com um n�mero:");
		n3 = leia.nextFloat();
		
		if(n1<n2 && n2<n3) {
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n1, n2, n3);
		}
		
		else if(n1<n3 && n3<n2){
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n1, n3, n2);
		}
		
		else if(n2<n1 && n1<n3){
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n2, n1, n3);
		}
		
		else if(n2<n3 && n3<n1){
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n2, n3, n1);
		}
		
		else if(n3<n1 && n1<n2){
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n3, n1, n2);
		}
		
		else{
			System.out.printf("Os n�meros em ordem crescente � %2.2f, %2.2f e %2.2f.", n3, n2, n1);
		}
		
		
		//Exerc�cio 3
		
		int idade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade");
		idade = leitura.nextInt();
		
		
		switch (idade) {
		case 10,11,12,13,14:
			System.out.println("Est� na categoria infantil");
			break;
		case 15,16,17:
			System.out.println("Est� na categoria juvenil");
			break;
		case 18,19,20,21,22,23,24,25:
			System.out.println("Est� na categoria adulto");
			break;
			
			default: 
			System.out.println("N�o h� categolria para a idade digitada");
			break;			
		}
		
		
		//Exerc�cio 4
		
		float raiz, pot, numero, resto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		numero = entrada.nextInt();
		
		resto = numero % 2;
				
		if(resto == 0) {
			
			raiz = (float) Math.sqrt(numero);
			System.out.println("O n�mero � par e sua raiz quadrada � "+raiz);
			
		}
		
		else {
			pot = (float) Math.pow(numero, 2);
			System.out.println("O n�mero � impar e elevado ao quadrado � "+pot);
		}
		
		
		
	}

}
