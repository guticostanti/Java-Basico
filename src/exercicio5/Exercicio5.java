package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas,
		o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o 
		n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero do funcion�rio: ");
		int funcNumber = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas: ");
		int horasTrab = sc.nextInt();
		System.out.println("Digite o valor da hora do funcion�rio: ");
		double valorHora = sc.nextDouble();
		double salario = horasTrab * valorHora;
		System.out.printf("N�mero do funcion�rio: %d", funcNumber);
		System.out.printf("%nSal�rio do funcion�rio: %.2f", salario);
		sc.close();
	}

}
