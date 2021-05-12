package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		/*
		Fazer um programa para ler o código de uma peça 1, o número de peças 1,
		o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
		e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Peça 1
		System.out.println("Digite o código da primeira peça: ");
		int peca1Cod = sc.nextInt();
		System.out.println("Digite a quantidade da primeira peça: ");
		int peca1Qtd = sc.nextInt();
		System.out.println("Digite o valor unitário da primeira peça: ");
		double peca1Unit = sc.nextDouble();
		
		// Peça 2
		System.out.println("Digite o código da segunda peça: ");
		int peca2Cod = sc.nextInt();
		System.out.println("Digite a quantidade da segunda peça: ");
		int peca2Qtd = sc.nextInt();
		System.out.println("Digite o valor unitário da segunda peça: ");
		double peca2Unit = sc.nextDouble();
		
		// Printando valor
		double valorTotal = (peca1Qtd * peca1Unit) + (peca2Qtd * peca2Unit);
		System.out.printf("%nValor a pagar: %.2f", valorTotal);
		sc.close();
	}
}
