package lista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o sal�rio base: ");
		double salBase = entrada.nextDouble();
		
		double salario = salBase + (salBase * 10 / 100);
		salario = salario - (salario * 5 / 100);
		
		System.out.println("Sal�rio total: " + salario);
		
		entrada.close();
	}

}
