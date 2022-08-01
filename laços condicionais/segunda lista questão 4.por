programa
{ // lição 4 lista 2
	
	funcao inicio()
	{
		inteiro num

		escreva("\nEntre com um número inteiro: ")
		leia(num)

		se(num % 2 == 0)
		{
			se (num>=0)
			{
				escreva("\nEste número é PAR e POSITIVO!!!")
			}
			senao
			{
				escreva("\nEste número é PAR e NEGATIVO!!!")
			}
		}
		senao{
			se (num>=0)
			{
				escreva("\nEste número é ÍMPAR E POSITIVO!!!")
			}
			senao{
				escreva("\nEste número é ÍMPAR E NEGATIVO!!!")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */