package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Ex10Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para 
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
