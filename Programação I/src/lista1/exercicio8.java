package lista1;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a medida da base maior: ");
		float baseMaior = teclado.nextFloat();

		System.out.print("Digite a medida da base menor: ");
		float baseMenor = teclado.nextFloat();
		
		System.out.print("Digite a medida da altura: ");
		float altura = teclado.nextFloat();
		
		System.out.print("Digite o preço por metro quadrado: ");
		float precoMetroQuadrado = teclado.nextFloat();
		
		float area = ((baseMaior + baseMenor) * altura) / 2;
		float preco = precoMetroQuadrado * area;
		
		System.out.println("A medida da área é: " + area + "m²");
		System.out.println("O preco é: R$" + preco);

		teclado.close();
	}
}
