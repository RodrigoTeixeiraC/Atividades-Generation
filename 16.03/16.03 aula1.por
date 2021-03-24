programa
{

	funcao inicio()
	{
		
		//Exercício 1
		escreva("\nExercício 1")
		inteiro ano, mes, dia, totalAno, totalMes, qtdDias

		escreva("\nDigite a quantidade de anos: ")
		leia(ano)
		escreva("Digite a quantidade de meses: ")
		leia(mes)
		escreva("Digite a quantidade de dias: ")
		leia(dia)

		totalAno = ano * 365
		totalMes = mes * 30
		qtdDias = totalAno + totalMes + dia

		escreva("A quantidade de dias correspondente aos anos, meses e dias digitados é: ",qtdDias," dias","\n")

		
		//Exercício 2
		escreva("\nExercício 2")
		
		inteiro ano2, mes2, dia2, dias2
		
		
		escreva("\nDigite a quantidade de dias: ")
		leia(dias2)

		ano2 = dias2 / 365.0
		mes2 = (dias2%365) / 30.0
		dia2 = (dias2%365)%30

		escreva("\nA quantidade de dias digitada representa ", ano2," ano(s) ",mes2," mes(es) e ",dia2," dia(s).") 

		
		//Exercício 3
		escreva("\nExercício 3")
		inteiro segundos, segundo, minuto, hora
		
		
		escreva("\nDigite a quantidade de segundos: ")
		leia(segundos)

		hora = segundos / 3600
		minuto = (segundos%3600) / 60.0
		segundo = (segundos%3600)%60

		escreva("\nA quantidade de segundos digitada representa ", hora," hora(s) ",minuto," minuto(s) e ",segundo," segundo(s).")
		
	}	

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */