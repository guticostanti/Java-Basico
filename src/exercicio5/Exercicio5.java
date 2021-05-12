package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
		número e o salário do funcionário, com duas casas decimais.
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do funcionário: ");
		int funcNumber = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas: ");
		int horasTrab = sc.nextInt();
		System.out.println("Digite o valor da hora do funcionário: ");
		double valorHora = sc.nextDouble();
		double salario = horasTrab * valorHora;
		System.out.printf("Número do funcionário: %d", funcNumber);
		System.out.printf("%nSalário do funcionário: %.2f", salario);
		sc.close();
	}

}
