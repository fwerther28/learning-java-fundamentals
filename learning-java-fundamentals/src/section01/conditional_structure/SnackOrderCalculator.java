package section01.conditional_structure;

import java.util.Locale;
import java.util.Scanner;

public class SnackOrderCalculator {

	public static void main(String[] args) {
		// Set locale to US to use dot (,) as decimal separator
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código e a quantidade: ");
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		
		double total;
		
		// The switch-case handles each specific item code from the PDF table 
		switch (code) {
		case 1:
			total = quantity * 4.00;
			break;
		case 2:
			total = quantity * 4.50;
			break;	
		case 3:
			total = quantity * 5.00;
			break;
		case 4:
			total = quantity * 2.00;
			break;
		case 5:
			total = quantity * 1.50;
			break;
		default:
			total = 0;
			System.out.println("Código inválido");
			break;
		}
		
		if (total > 0) {
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
	}

}
