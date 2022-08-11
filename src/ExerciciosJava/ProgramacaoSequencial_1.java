package ExerciciosJava;

import java.util.Scanner;

/*
 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

 */
public class ProgramacaoSequencial_1 {

	public static void main(String[] args) {
		int idade, ano, meses, dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o ano de seu nascimento: ");
		ano = leia.nextInt();
		System.out.println("\nInforme os meses de nascimento ");
		meses = leia.nextInt();
		System.out.println("\nInforme o dia de nascimento: ");
		dias = leia.nextInt();
		
		idade =((ano*365) +(meses*30)+dias);
		System.out.println("\nSua idade em dias é: "+idade);
				
	}

}
