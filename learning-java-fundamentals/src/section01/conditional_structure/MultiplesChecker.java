package section01.conditional_structure;

import java.util.Scanner;

public class MultiplesChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números inteiros (A e B): ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// Multiple logic works if the remainder of the division (%) is zero.
		// We check in both directions (A/B or B/A) to handle different input orders.
		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");
		} else {
			
			System.out.println("Não são Multiplos");
		}
		sc.close();
	}

}
