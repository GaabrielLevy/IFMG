package lista1;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o sal�rio: ");
		double salario = teclado.nextDouble();
		
		System.out.println("Digite o n�mero de vendas");
		int vendas = teclado.nextInt();
		
		double beneficio = salario + (vendas * 4 / 100);
		
		System.out.println("Benef�cio: " + beneficio);
		
		teclado.close();
	}
}
