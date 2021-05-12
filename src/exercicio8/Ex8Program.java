package exercicio8;

import java.util.Locale;
import java.util.Scanner;

import exercicio8.Rectangle;

public class Ex8Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle ret = new Rectangle();
		System.out.println("Digite a largura: ");
		ret.width = sc.nextDouble();
		System.out.println("Digite a altura: ");
		ret.height = sc.nextDouble();
		System.out.println("Area: " + ret.area());
		System.out.println("Perimeter: " + ret.perimeter());
		System.out.println("Diagonal: " + ret.diagonal());
		
		sc.close();
	}
}
