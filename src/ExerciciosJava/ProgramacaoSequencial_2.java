package ExerciciosJava;

import java.util.Scanner;

/*
 * 2 Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
 */
public class ProgramacaoSequencial_2 {

	public static void main(String[] args) {
		int dia, meses, anos, dias;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite sua idade em dias: ");
			dia = leia.nextInt();
			anos = dia / 365;
			meses = (dia % 365) / 30;
			
			System.out.println("\nVocê tem " +anos+ "anos de idade: ");
			System.out.println("" +meses+ "meses");
			System.out.println("" +dia+ "dias");

			
	}

}
