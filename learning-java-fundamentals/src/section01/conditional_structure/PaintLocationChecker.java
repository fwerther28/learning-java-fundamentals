package section01.conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class PaintLocationChecker {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas X e Y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		// Logic to determine quadrant or axes position
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0 ) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0 ) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		sc.close();
	}

}
