package Turma20;

import java.util.Scanner;

public class array {
	
	public static void main(String[] args) {
		
		System.out.println("Exerc�cio 1");
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma = A[0] + A[1] + A[5];
		A[4] = 100; 
		
		System.out.println("O resultado da soma pedida �: "+soma);
		for(int x=0;x<6;x++) {
			System.out.println("O Valor to vetor A na posi��o "+x+" �: "+A[x]);
		}
		
		System.out.println("\nExerc�cio 2");
		
		int[] numeros = new int[6];
		int somapar=0,contimpar=0;
		String par, impar;
		
		par = "Os numeros pares s�o: ";
		impar = "Os numeros impares s�o: ";
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\nEntre com o "+(x+1)+"� n�mero: ");
			numeros[x] = leia.nextInt();
			
			if(numeros[x]%2==0)
			{
				somapar = somapar + numeros[x];
			}
			else
			{
				contimpar++;
			}
		}
		
		for(int x=0;x<6;x++)
		{
			if(numeros[x]%2==0)
			{
				par = par + numeros[x] +", ";
			}
			else
			{
				impar = impar + numeros[x]+", ";
			}
		}
		System.out.println("\nSoma dos n�meros pares: "+somapar);
		System.out.println("\nQuantidade de n�meros impares: "+contimpar);
		System.out.println("\n"+par);
		System.out.println("\n"+impar);
	}

}
