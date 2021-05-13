package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Ex10Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
		resolver este problema
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Dgite a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE: " + aluno.calculoNotaFinal());
		aluno.passedOrNot();
		sc.close();
	}

}
