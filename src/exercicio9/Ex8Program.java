package exercicio9;

import java.util.Locale;
import java.util.Scanner;

import exercicio9.Employee;

public class Ex8Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
		seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
		salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
		afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
		projetada abaixo
		*/
		Locale.setDefault(Locale.US);
		Employee funcionario = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do funcionário: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("Funcionário: " + funcionario.name + ", salário líquido: " + funcionario.netSalary());
		System.out.println("Aumentar salário em qual porcentagem?");
		double novoSalario = funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println("Dados Atualizados");
		System.out.println("Funcionário: " + funcionario.name + ", salário líquido: " + novoSalario);
		sc.close();
		
	}

}
