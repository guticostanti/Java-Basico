package exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		/*
		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		Em seguida, calcule e mostre os seguintes valores com 3 casas decimais: 
		a) a área do triângulo retângulo que tem A por base e C por altura. 
		b) a área do círculo de raio C. (pi = 3.14159) 
		c) a área do trapézio que tem A e B por bases e C por altura. 
		d) a área do quadrado que tem lado B. 
		e) a área do retângulo que tem lados A e B
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		double a = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double b = sc.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		double c = sc.nextDouble();
		
		double areaTriangulo = (a * c) / 2;
		double areaCirculo = 3.14159 * c * c;
		double areaTrapezio = (a + b) * c / 2;
		double areaQuadrado = b * b;
		double areaRetangulo = a * b;
		
		System.out.printf("Triângulo: %.3f%n", areaTriangulo);
		System.out.printf("Circulo: %.3f%n", areaCirculo);
		System.out.printf("Trapézio: %.3f%n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f", areaRetangulo);
		sc.close();
	}
}
