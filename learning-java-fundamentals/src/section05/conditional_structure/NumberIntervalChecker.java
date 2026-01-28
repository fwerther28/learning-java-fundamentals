package section05.conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class NumberIntervalChecker {

	public static void main(String[] args) {
		// Use US Locale for double input with dots
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double value = sc.nextDouble();
		
		// Check each interval according to the PDF prompt
		if (value >= 0 && value <= 25.0) {
			System.out.println("Intervalo [0.25]");
		} else if (value > 25.0 && value <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (value > 50.00 && value <= 75.0) {
			System.out.println("Intervalo (50,75");
		} else if (value > 75.0 && value <= 100.0) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
