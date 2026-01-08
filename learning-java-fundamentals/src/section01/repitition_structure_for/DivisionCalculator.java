package section01.repition_structure_for;

import java.util.Scanner;

public class DivisionCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de pares: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossível");
			} else {
				double result = (double) x / y;
				System.out.printf("%.1f%n", result);
			}	
		}	
		sc.close();
	}
}
