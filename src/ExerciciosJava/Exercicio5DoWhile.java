package ExerciciosJava;
/*
 * 5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 */

import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		int num, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		System.out.println("\nDigite seu número aqui: ");
		num = leia.nextInt();
		soma += num;
		
		} while (num != 0);
		System.out.println("\nO resultado da soma é: "+soma);
		
		
	}

}
