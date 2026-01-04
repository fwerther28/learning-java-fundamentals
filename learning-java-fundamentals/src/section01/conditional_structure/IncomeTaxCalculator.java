package section01.conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o salário");
		double salary = sc.nextDouble();
		
		double tax;
		
		// Calculate tax based on salary brackets
		if (salary <= 2000.0) {
			tax = 0.0;
		} else if (salary <= 3000.0) {
			tax = (salary - 2000.0) * 0.08;
		} else if (salary <= 4500.0) {
			tax = (1000.0 * 0.08) + (salary - 3000.0) * 0.18;
		} else {
			tax = (1000.0 * 0.08) + (1500.0 * 0.18) + (salary - 4500.0) * 0.28;	
		}
		
		//Output formatting
		if (tax == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", tax);
		}

	}

}
