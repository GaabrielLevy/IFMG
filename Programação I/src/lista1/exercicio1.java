package lista1;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {	
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		int num2 = teclado.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		int num3 = teclado.nextInt();
		
		int soma = num1 + num2 + num3;
		float media = soma / 3;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia �: " + media);
		
		teclado.close();
	}
}
