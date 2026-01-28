package section01.repetition_structure_while;

import java.util.Scanner;

public class FuelPreferenceChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Initialize counters for each fuel type
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		System.out.println("Digite o código (1, 2, 3 e 4 para finalizar):");
		int code = sc.nextInt();
		
		// The loop repeats until the user types code 4
		while (code != 4) {
			if (code == 1) {
				alcohol++;
			} else if (code == 2) {
				gasoline++;
			} else {
				diesel++;
			}
			// If the code is not 1, 2, 3, or 4, nothing happens, just ask again
			
			code = sc.nextInt();
		}
		
		// Final output according to the PDF example
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcohol);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
		
		sc.close();

	}

}
