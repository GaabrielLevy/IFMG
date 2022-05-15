package lista1;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite o peso da primeira nota: ");
		int peso1 = teclado.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int num2 = teclado.nextInt();
		
		System.out.print("Digite o peso da segunda nota: ");
		int peso2 = teclado.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		int num3 = teclado.nextInt();
		
		System.out.print("Digite o peso da terceira nota: ");
		int peso3 = teclado.nextInt();
		
		double mediaP = (num1 * peso1 + num2 * peso2 + num3 * peso3) / (peso1 + peso2 + peso3);
	
		System.out.println("A média ponderada é: " + mediaP);
		
		teclado.close();
	}

}
