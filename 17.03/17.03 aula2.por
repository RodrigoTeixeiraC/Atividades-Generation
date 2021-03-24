programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{

		//Exercício 1
		real P, E, M 
		
		escreva("Exercício 1")
		escreva("\nDigite o peso dos tomates: ")
		leia(P)

		se (P>0 e P<=50){
			E = 0
			M = 0
		}
		
		senao se (P > 50){
			E = P - 50
			M = E * 4
		}

		senao {
			E = 0
			M = 0
			escreva("Não há carga de tomates")
		}

		escreva("\nPeso total: ",P," Kg","\nExcesso: ",E," Kg","\nMulta: R$",M,"\n")



		//Exercício 2
		real N, S, ST, SE
		inteiro C

		escreva("\nExercício 2")
		escreva("\nDigite o seu código: ")
		leia(C)
		escreva("Digite as horas trabalhadas: ")
		leia(N)

		se(N<=50){
			ST = N * 10.0
			SE = 0.0
		}
		senao se(N>50){
			S = 50.0 * 10.0
			SE = (N - 50.0) * 20
			ST = S + SE
		}
		senao{
			ST = 0
			SE = 0
			escreva("\nNão houveram horas trabalhadas")
		}
			
 		escreva("\nO trabalhador/a de código ",C," trabalhou ",N," hora(s).\nSalário total: R$",ST,"\nSalário excedente: R$",SE,"\n")



		//Exercício 3
		escreva("\nExercício 3")
		real a, b, c, d, a2, b2, c2, d2

		escreva("\nDigite o primeiro número: ")
		leia(a)
		escreva("Digite o segundo número: ")
		leia(b)
		escreva("Digite o terceiro número: ")
		leia(c)
		escreva("Digite o quarto número: ")
		leia(d)

		a2 = mat.potencia(a, 2)
		b2 = mat.potencia(b, 2)
		c2 = mat.potencia(c, 2)
		d2 = mat.potencia(d, 2)

		se(c2>=1000){
			escreva("\nO terceiro número foi ",c," e seu quadrado é ",c2)
		}
		senao{
			escreva("\nO primeiro número foi ",a," e seu quadrado é ",a2)
			escreva("\nO segundo número foi ",b," e seu quadrado é ",b2)
			escreva("\nO terceiro número foi ",c," e seu quadrado é ",c2,"\n")
			escreva("\nO quarto número foi ",d," e seu quadrado é ",d2,"\n")
		}	



		//Exercício 4
		escreva("\nExercício 4")
		inteiro numero

		escreva("\nDigite um número inteiro: ")
		leia(numero)

		se(numero%2 == 0){
			escreva("\nO número digitado é par")
		}
		senao{
			escreva("\nO número digitado é impar")
		}

		se(numero>0){
			escreva("\nO número digitado é positivo\n")
		}
		senao se(numero<0){
			escreva("\nO número digitado é negativo\n")
		}
		senao{
			escreva("\nO número digitado foi 0\n")
		}





		//Exercício 5
		escreva("\nExercício 5")

		real poluicao

		escreva("\nDigite o índice de poluição: ")
		leia(poluicao)

		se(poluicao < 0.25){
			escreva("\nÍndice de poluição aceitavel.\n")
		}
		senao se(poluicao>0.25 e poluicao<0.3){
			escreva("\nÍndice de poluição alta\n")
		}	
		senao se(poluicao>=0.3 e poluicao<0.4){
			escreva("\nÍndice de poluição alta, indústrias do 1º grupo devem suspender atividades!\n")
		}
		senao se(poluicao>=0.4 e poluicao<0.5){
			escreva("\nÍndice de poluição alta, indústrias do 1º e 2º grupo devem suspender atividades!\n")
		}
		senao {
			escreva("\nÍndice de poluição muito alta, todos os grupos de indústrias devem suspender atividades!\n")	
		}




		//Exercício 6
		escreva("\nExercício 6")
		
		inteiro idade

		escreva("\nDigite sua idade: ")
		leia(idade)

		se(idade>=5 e idade<=7){
			escreva("\nSua categoria é: Infantil A\n")
		}
		senao se(idade>=8 e idade<=11){
			escreva("\nSua categoria é: Infantil B\n")
		}
		senao se(idade==12 ou idade==13){
			escreva("\nSua categoria é: Juvenil A\n")
		}
		senao se(idade>=14 e idade<=17){
			escreva("\nSua categoria é: Juvenil B\n")
		}
		senao se(idade>=18){
			escreva("\nSua categoria é: Adulto\n")
		}
		senao {
			escreva("\nCategoria não definida para essa idade\n")
		}



		//Exercício 7
		escreva("\nExercício 7")
		
		real altura, base, area

		escreva("\nDigite o valor da base do triangulo: ")
		leia(base)
		escreva("\nDigite o valor da altura do triangulo: ")
		leia(altura)

		se(altura>0 e base>0){
			area = (altura * base) / 2
			escreva("\nA área do triangulo é: ",area,"\n")
		}
		senao{
			escreva("Não é possivel calcular a área com valores negativos ou zero\n")
		}





		//Exercício 8
		escreva("\nExercício 8")
		
		inteiro variavel

		escreva("\nDigite uma variável numérica: ")
		leia(variavel)

		se(variavel>100){
			 escreva("\nO valor da variavel é: ",variavel,"\n")
		}
		senao{
			escreva("\nO valor da variavel é: 0\n")
		}
			  
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */