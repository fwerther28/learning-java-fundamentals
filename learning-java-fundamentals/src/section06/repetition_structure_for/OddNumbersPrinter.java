package section06.repetition_structure_for;

import java.util.Scanner;

public class OddNumbersPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int x = sc.nextInt();
		
		// The loop starts at 1 and goes up to x 
		for (int i = 1; i <= x; i++) {
			// If the reminder of division by 2 is not zero, it's odd
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
