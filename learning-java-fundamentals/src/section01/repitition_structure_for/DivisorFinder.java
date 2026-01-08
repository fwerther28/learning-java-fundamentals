package section01.repition_structure_for;

import java.util.Scanner;

public class DivisorFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		// The loop test all numbers from 1 up to N itself
		for (int i = 1; i <= n; i++) {
			// If the remainder of N divided by i is zero, i is a divisor 
			if (n % i == 0 ) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
