package lista1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num = teclado.nextInt();
		
		int antecessor = num - 1;
		int sucessor = num + 1;
		
		System.out.println("O antecessor de " + num + " � " + antecessor + " e o sucessor � " + sucessor);
	
		teclado.close();
	}

}
