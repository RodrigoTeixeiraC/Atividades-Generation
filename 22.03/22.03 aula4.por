programa
{
	
	funcao inicio()
	{
		//Exercício 1
		escreva("\nExercício 1")
		inteiro vet[5], x, maiorpont=0

		para(x=0;x<5;x++){
			escreva("\nDigite o valor da pontuação: ")
			leia(vet[x])

			escreva(vet[x])

			se(vet[x] > maiorpont){
				maiorpont = vet[x]}
			}
		escreva("\nA maior pontuação é: ", maiorpont)	




		//Exercício 2
		escreva("\nExercício 2")

		inteiro vetor[10], y, maiorsort=0, soma=0, contse=0, cont=0, media

		para(y=0;y<10;y++){
			vetor[y]=sorteia(1,6)

			soma = vetor[y] + soma

			se(vetor[y] > maiorsort){
				maiorsort = vetor[y]
				contse++
				}

			cont++
		}
		media = soma / cont

		escreva("\nA média aritimética é: ", media)
		escreva("\nA ocorrencia de maior pontuação foi: ", contse)




		//Exercício 3
		escreva("\nExercício 3\n")

		inteiro l, c, n1[4][6], n2[4][6], m1[4][6], m2[4][6]  

		  para(l=0;l<4;l++)
		  {
		  	  para(c=0;c<4;c++)
		  	  {
		  	  	escreva("\nDigite o valor: ")
		  	  	leia(n1[l][c])
		  	  	escreva(n1[l][c])	
		  	  }
		  }

		   para(l=0;l<4;l++)
		  {
		  	  para(c=0;c<4;c++)
		  	  {
		  	  	escreva("\ndigiteo valor: ")
		  	  	leia(n2[l][c])
		  	  	escreva("\n",n2[l][c])	
		  	  }
		  }
		   
		   para(l=0;l<4;l++)
		  {
		  	  para(c=0;c<4;c++)
		  	  {
		  	  m1[l][c] = n1[l][c] + n2[l][c]
		  	  escreva("\n",m1[l][c])	
		  	  }
		  }

		   para(l=0;l<4;l++)
		  {
		  	  para(c=0;c<4;c++)
		  	  {
		  	  m2[l][c] = n1[l][c] - n2[l][c]
		  	  escreva("\n",m2[l][c])	
		  	  }
		  }


		  //Exercício 4
		escreva("\nExercício 4\n")

		inteiro l1, c1, matriz[3][3], soma1=0, diagonal

		para(l1=0;l1<3;l1++){
			para(c1=0;c1<3;c1++){
				escreva("\nDigite um número: ")
				leia(matriz[l1][c1])
				soma1 = soma1 + matriz[l1][c1]
			}
		}
		l1=0
		c1=0

		diagonal = matriz[l1][c1] + matriz[l1++][c1++] + matriz[l1++][c1++]

		escreva("\nA soma de todos os valores é: ", soma1)
		escreva("\nA soma da diagonal é: ", diagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1872; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */