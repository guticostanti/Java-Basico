package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		/*
		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		calcule e mostre a diferen�a do produto de A e B pelo produto de C e D 
		segundo a f�rmula: DIFERENCA = (A * B - C * D) 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero (A): ");
		int A = sc.nextInt();
		System.out.println("Digite o segundo n�mero (B): ");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro n�mero (C): ");
		int C = sc.nextInt();
		System.out.println("Digite o quarto n�mero (D): ");
		int D = sc.nextInt();
		int resultado = A * B - C * D;
		System.out.printf("O resultado de (A * B - C * D) �: %d", resultado);
		sc.close();
	}
}
