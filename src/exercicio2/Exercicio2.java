package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela
		a soma desses n�meros com uma mensagem explicativa.
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.printf("%nA soma entre %d e %d � igual a %d", a, b, c);
		sc.close();
	}

}
