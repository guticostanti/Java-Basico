package exercicio10;

public class Aluno {

	String nome;
	double nota1, nota2, nota3;
	
	public double calculoNotaFinal() {
		return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35;
	}
	
	public String passedOrNot() {
		if (calculoNotaFinal() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
		};
		return nome;
	}
}
