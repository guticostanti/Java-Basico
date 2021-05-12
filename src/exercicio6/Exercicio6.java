package exercicio6;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		/*
		Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
		o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2
		e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago. 
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Pe�a 1
		System.out.println("Digite o c�digo da primeira pe�a: ");
		int peca1Cod = sc.nextInt();
		System.out.println("Digite a quantidade da primeira pe�a: ");
		int peca1Qtd = sc.nextInt();
		System.out.println("Digite o valor unit�rio da primeira pe�a: ");
		double peca1Unit = sc.nextDouble();
		
		// Pe�a 2
		System.out.println("Digite o c�digo da segunda pe�a: ");
		int peca2Cod = sc.nextInt();
		System.out.println("Digite a quantidade da segunda pe�a: ");
		int peca2Qtd = sc.nextInt();
		System.out.println("Digite o valor unit�rio da segunda pe�a: ");
		double peca2Unit = sc.nextDouble();
		
		// Printando valor
		double valorTotal = (peca1Qtd * peca1Unit) + (peca2Qtd * peca2Unit);
		System.out.printf("%nValor a pagar: %.2f", valorTotal);
		sc.close();
	}
}
