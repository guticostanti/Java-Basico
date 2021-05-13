package exercicio10;

public class Aluno {

	String nome;
	double nota1, nota2, nota3;
	
	public double calculoNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public void passedOrNot() {
		if (calculoNotaFinal() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double missingPoints = 60 - calculoNotaFinal();
			System.out.printf("MISSING %.2f POINTS", missingPoints);
		};
	}
}
