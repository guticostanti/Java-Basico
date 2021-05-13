package exercicio9;

import java.util.Locale;
import java.util.Scanner;

import exercicio9.Employee;

public class Ex8Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em 
		seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o 
		sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � 
		afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe 
		projetada abaixo
		*/
		Locale.setDefault(Locale.US);
		Employee funcionario = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o sal�rio bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("Funcion�rio: " + funcionario.name + ", sal�rio l�quido: " + funcionario.netSalary());
		System.out.println("Aumentar sal�rio em qual porcentagem?");
		double novoSalario = funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println("Dados Atualizados");
		System.out.println("Funcion�rio: " + funcionario.name + ", sal�rio l�quido: " + novoSalario);
		sc.close();
		
	}

}
