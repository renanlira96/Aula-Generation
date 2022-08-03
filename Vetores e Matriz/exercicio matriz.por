programa
{
/*
 * Matriz - 4: Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
	
	funcao inicio()
	{
	inteiro matriz[3][3],linha,coluna,valorTotal=0,valorDiagonal=0

		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um número: ") 
				leia(matriz[linha][coluna])
				valorTotal += matriz[linha][coluna]
				se(linha == coluna)
				{
					valorDiagonal += matriz[linha][coluna]	
				}
			}
		}
		escreva("\nSoma de todos os valores:",valorTotal)
		escreva("\nSoma de todos os valores da diagonal:",valorDiagonal)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 11, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */