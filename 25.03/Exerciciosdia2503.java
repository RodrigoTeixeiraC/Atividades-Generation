package Turma20;

import java.util.Scanner;

public class Exerciciosdia2503 {
	
	public static void main(String[] args) {
		
		//Exercício 1
		
				
		float x1, x2, x3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		x1 = ler.nextFloat();
		
		System.out.println("Entre com um número:");
		x2 = ler.nextFloat();
		
		System.out.println("Entre com um número:");
		x3 = ler.nextFloat();
		
		
		if(x1>x2 && x1>x3) {
			System.out.println("O maior número é "+x1);
		}
		
		else if(x2>x1 && x2>x3){
			System.out.println("O maior número é "+x2);
		}
		
		else{
			System.out.println("O maior número é "+x3);
		}
		
		
		
		
		//Exercicio 2
		float n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com um número:");
		n2 = leia.nextFloat();
		
		System.out.println("Entre com um número:");
		n3 = leia.nextFloat();
		
		if(n1<n2 && n2<n3) {
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n1, n2, n3);
		}
		
		else if(n1<n3 && n3<n2){
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n1, n3, n2);
		}
		
		else if(n2<n1 && n1<n3){
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n2, n1, n3);
		}
		
		else if(n2<n3 && n3<n1){
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n2, n3, n1);
		}
		
		else if(n3<n1 && n1<n2){
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n3, n1, n2);
		}
		
		else{
			System.out.printf("Os números em ordem crescente é %2.2f, %2.2f e %2.2f.", n3, n2, n1);
		}
		
		
		//Exercício 3
		
		int idade;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("\nEntre com a idade");
		idade = leitura.nextInt();
		
		
		switch (idade) {
		case 10,11,12,13,14:
			System.out.println("Está na categoria infantil");
			break;
		case 15,16,17:
			System.out.println("Está na categoria juvenil");
			break;
		case 18,19,20,21,22,23,24,25:
			System.out.println("Está na categoria adulto");
			break;
			
			default: 
			System.out.println("Não há categolria para a idade digitada");
			break;			
		}
		
		
		//Exercício 4
		
		float raiz, pot, numero, resto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		numero = entrada.nextInt();
		
		resto = numero % 2;
				
		if(resto == 0) {
			
			raiz = (float) Math.sqrt(numero);
			System.out.println("O número é par e sua raiz quadrada é "+raiz);
			
		}
		
		else {
			pot = (float) Math.pow(numero, 2);
			System.out.println("O número é impar e elevado ao quadrado é "+pot);
		}
		
		
		
	}

}
