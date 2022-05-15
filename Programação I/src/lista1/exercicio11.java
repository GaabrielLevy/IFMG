package lista1;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		double salario = teclado.nextDouble();
		
		System.out.println("Digite o valor da primeira conta: ");
		double conta1 = teclado.nextDouble();

		System.out.println("Digite o valor da segunda conta: ");
		double conta2 = teclado.nextDouble();
		
		salario = salario - (conta1 + (conta1 * 2 / 100)) - (conta2 + (conta2 * 2 / 100));
		
		System.out.println("Salário final: " + salario);
		
		teclado.close();

	}
}
