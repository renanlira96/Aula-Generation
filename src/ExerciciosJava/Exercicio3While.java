package ExerciciosJava;

import java.util.Scanner;

/*
 * 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */

public class Exercicio3While {

	public static void main(String[] args) {
		
		int idade = 0, idade_21=0, idade_50=0;
		 Scanner leia = new Scanner(System.in);
		 System.out.println("\nDigite a sua idade aqui: ");
		 idade = leia.nextInt();
		 
		 while(idade != -99) { 
			 if(idade<21) {
				 idade_21 = idade_21 + 1; 
			 }
			 else if(idade>50) {
				 idade_50 = idade_50 +1;
			 }
			 System.out.println("\nDigite uma outra idade: ");
			idade = leia.nextInt();
		 }
		 		System.out.println("\nO total de pessoas com menos de 21 são: "+idade_21);
		 		System.out.println("\nO total de pessoas com mais de 50 anos são: "+idade_50);
		 
	}

}
