programa
{
	
	funcao inicio()
	{
		//Exercício 1
		escreva("\nExercício1")
		
		inteiro x, filhos
		real salario, somasalario=0.0, somafilhos=0, mediasalario, mediafilhos, maiorsalario=0.0, salariobaixo=0.0, porcentagem

		para(x=1;x<=4;x++){
			
			limpa()
			escreva("\nDigite o valor do salário: ")
			leia(salario)
			escreva("\nDigite o número de filhos: ")
			leia(filhos)

			somasalario = somasalario + salario
			somafilhos = somafilhos + filhos

			se(salario>maiorsalario){
				maiorsalario = salario
			}
			se(salario<=100){
				salariobaixo++
			}
		}

		mediasalario = somasalario / 4
		mediafilhos = somafilhos / 4
		porcentagem = (salariobaixo*100) / 4
		
		escreva("\nA média do salário da população é: R$ ", mediasalario)
		escreva("\nA média do número de filhos é: ", mediafilhos)
		escreva("\nO maior salário é: R$ ", maiorsalario)
		escreva("\nO percentual de pessoas com salário até R$100 é :", porcentagem,"%\n")


		//Exercício 2
		escreva("\nExercício2\n")
		inteiro y=0, soma=0

		para(y=1;y<=500;y++)
		{
			se(y%2 != 0)
			{
				se(y%3 == 0)
				{
				soma = soma + y	
				}
				
			}
			
		}

		escreva("\nO resultado da soma de todos os números ímpares que são  múltiplos de três\ne que se encontram no conjunto dos números de 1 até 500 é: ", soma,"\n")




		//Exercício 3
		escreva("\nExercício3\n")

		real num, somanum=0.0, media
		inteiro contnum=0
		escreva("Entre com um número e negativo para parar: ")
		leia(num) 

		enquanto(num>=0)
		{
			contnum++
			somanum = somanum + num
			escreva("\nEntre com um número e negativo para parar: ")
			leia(num)
		}
		se(contnum == 0)
		{
		escreva("\nNão é possivel fazer essa operação")	
		}
		senao{
		media = somanum / contnum
		
		escreva("\nO total somatório é: ",somanum)
		escreva("\nA média é: ",media)
		escreva("\nO total dos valores lidos é: ",contnum,"\n")
		}



	//Exercício 4
		escreva("\nExercício4\n")

		real numero
		
		
		escreva("Entre com um número: ")
		leia(numero)

		enquanto(numero<=100)
		{
			numero = numero * 3
			escreva("\n",numero)
		}

		escreva("\nPrograma finalizado\n")


		//Exercício 5
		escreva("\nExercício5\n")

		inteiro contagem=233, numsoma
		
		
		faca
		{
			se(contagem>=300 e contagem<=400){
				numsoma=3
				}
			senao{
				numsoma=5
				}

				contagem = contagem + numsoma

				escreva("\nContagem: ",contagem)
		}
		enquanto(contagem>=233 e contagem <=456)


		//Exercício 6
		escreva("\nExercício6\n")

		inteiro n, s=0, somadetodos=0

		escreva("\nDigite um número do seu teclado: ")
		leia(n)
		
		faca{
			s++
			somadetodos = somadetodos + s
			}
			
		enquanto(s!=n)

		escreva("O resultado da soma de todos é: ",somadetodos)
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */