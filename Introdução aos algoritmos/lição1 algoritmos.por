programa
{ // atividade lição 1 introdução aos Algorítmos 
	
	
	funcao inicio()
	{
		inteiro idade, ano, meses, dias
		escreva("\nDigite o idade de seu nascimento:")
		leia(ano)	
		escreva("\nInforme os meses de nascimento:")
		leia(meses)
		escreva("\nInforme o dia de nascimento:")
		leia(dias)

		idade =((ano*365)+(meses*30)+dias)
		escreva(" Sua idade em dias:",idade)
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 60; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */