package ExerciciosJava;

import java.util.Scanner;

public class lacos_de_decicao1 {

	public static void main(String[] args) {
	int num1,num2,num3;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("\nDigite o primeiro número: ");
	num1 = leia.nextInt();
	System.out.println("\nDigite o segundo número: ");
	num2 = leia.nextInt();
	System.out.println("\nDigite o terceiro número: ");
	num3 = leia.nextInt();
	
	if(num1>num2 && num1>num3) {
		System.out.println("\nO seu maior número foi o primeiro digitado: "+num1);
	}else if(num2>num1 && num2>num3) {
		System.out.println("\nMaior número: "+num2);
	}
	else 	{ System.out.println("\nO terceiro resultado é o maior número:"+num3);
		
	}
	}

}
