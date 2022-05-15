package lista1;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = teclado.nextInt();
		
		System.out.print("Digite o terceiro número: ");
		int num3 = teclado.nextInt();
		
		int soma = num1 + num2 + num3;
		float media = soma / 3;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);
		
		teclado.close();
	}
}
