package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo
		com quatro casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159 
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio: ");
		double r = sc.nextDouble();
		double area = 3.14159 * r * r;
		System.out.printf("%nA área da circunferência é de %.4f metros quadrados.", area);
		sc.close();
	}

}
