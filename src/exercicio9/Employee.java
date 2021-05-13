package exercicio9;

public class Employee {
	
	String name;
	double grossSalary;
	double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double aumento) {
		return netSalary() + (grossSalary * aumento * 0.01);
	}
}
