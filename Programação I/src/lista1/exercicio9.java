package lista1;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o n�mero de lados de um pol�gono: ");
		float lados = entrada.nextFloat();
		
		float diagonais = lados*(lados - 3)/2;
		
		System.out.println("O pol�gono convexo regular de " + lados + " lados tem " + diagonais + " diagonais.");
		
		entrada.close();
	}

}
