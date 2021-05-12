package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		/*
		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		calcule e mostre a diferença do produto de A e B pelo produto de C e D 
		segundo a fórmula: DIFERENCA = (A * B - C * D) 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número (A): ");
		int A = sc.nextInt();
		System.out.println("Digite o segundo número (B): ");
		int B = sc.nextInt();
		System.out.println("Digite o terceiro número (C): ");
		int C = sc.nextInt();
		System.out.println("Digite o quarto número (D): ");
		int D = sc.nextInt();
		int resultado = A * B - C * D;
		System.out.printf("O resultado de (A * B - C * D) é: %d", resultado);
		sc.close();
	}
}
