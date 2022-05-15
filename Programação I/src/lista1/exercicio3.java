package lista1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite o segundo número: ");
		int num2 = teclado.nextInt();
		
		int num3 = 0;
		
		while(num3 == 0) {
			System.out.print("Digite o terceiro número: ");
			num3 = teclado.nextInt();
			
			if(num3 == 0) 
				System.out.println("O teceiro número não pode ser 0");
		}
		
		float resultado = num1 * num2 / num3;
		
		System.out.println(num1 + " * " + num2 + " / " + num3 + " = " + resultado);
		
		teclado.close();
	}

}
