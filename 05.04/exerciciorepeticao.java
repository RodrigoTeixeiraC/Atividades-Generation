package Turma20;

import java.util.Scanner;

public class exerciciorepeticao {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Exerc�cio 1");
		
		for(int x=1000; x<=1999; x++) {
			if(x%11 == 5) {
				System.out.println(x);
			}
		}
		
		
		float contimpar=0, contpar=0, n; 
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Exerc�cio 2");
		
		for(int x=1;x<=10;x++) {
			
			System.out.println("Escreva o " + x + "� n�mero");
			
			n = ler.nextFloat();
			if(n%2 == 0) {
				contpar++;
			}
			else {
				contimpar++;
			}
		}
		
		System.out.printf("A quantidade de numeros pares � %1.0f e a quantidade de numeros impares � %1.0f", contpar, contimpar);
		
		
		System.out.println("\nExerc�cio 3");
		
		float cont=0, menor=0, maior=0, idade=0;
		
		Scanner leitura = new Scanner(System.in);
		
		while(idade!=-99) {
			
			System.out.println("Entre com a idade:");
			
			idade = leitura.nextFloat();
			
			if(idade < 21 && idade > 0) {
				menor++;
			}
			else if(idade > 50){
				maior++;
			}
			
			if(idade != -99) {
				cont++;
			}
			
			
		}
		
		System.out.println("O total de pessoas � "+cont+", temos um total "
				+ "de "+menor+" pessoas com menos de 21 anos e "+maior+" pessoas "
						+ "com mais de 50 anos.");
		
		
		System.out.println("Exexrc�cio 4");
		
		float idade1, sexo, opcoes, contador=0, calma=0, mn=0, ha=0, oc=0, n40=0, c18=0;
		
		Scanner entrada = new Scanner(System.in);
				
				while(contador != 5) {
					System.out.println("Entre com a idade:");
					idade1 = entrada.nextFloat();
					System.out.println("Digite uma op��o:\n1- feminino\n2- masculino\n3- Outros");
					sexo = entrada.nextFloat();
					System.out.println("Digite uma op��o:\n1- calma\n2- nervosa\n3- agressiva");
					opcoes = entrada.nextFloat();
					
					if(opcoes == 1) {
						calma++;
					}
					if(sexo == 1 && opcoes == 2) {
						mn++;
					}
					if(sexo == 2 && opcoes == 3) {
						ha++;
					}
					if(sexo == 3 && opcoes == 1) {
						oc++;
					}
					if(idade1 > 40 && opcoes == 2) {
						n40++;
					}
					if(idade < 18 && opcoes == 1) {
						c18++;
					}	
					
					contador++;
				}
				
				
				System.out.println("O n�mero de pessoas calmas �: "+calma);
				System.out.println("O n�mero de mulheres nervosas �: "+mn);
				System.out.println("O n�mero de homens agressivos �: "+ha);
				System.out.println("O n�mero de outros calmos �: "+oc);
				System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+n40);
				System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+c18);
				
				
				System.out.println("Exerc�cio 5");
				
				float numero, soma=0;
				
				Scanner digitar = new Scanner(System.in);
				
				do{
					System.out.println("Entre com um n�mero do teclado: ");
					numero = digitar.nextFloat();
					soma = soma + numero;
				}
				while(numero != 0);
				
				System.out.println("A soma dos n�meros digitados �: "+soma);
				
				
				System.out.println("Exerc�cio 6");
				
				float inteiro, cont3=0, media3, soma3=0;
				
				Scanner escreva = new Scanner(System.in);
				
				do{
					System.out.println("Entre com um n�mero inteiro:");
					inteiro = escreva.nextFloat();
					
					if(inteiro%3 == 0 && inteiro != 0 ) {
						cont3++;
						soma3 = soma3 + inteiro;
					}
				}
				while(inteiro != 0);
				
				media3 = soma3 / cont3;
				
				System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: "+media3);
						
		
	}

}
