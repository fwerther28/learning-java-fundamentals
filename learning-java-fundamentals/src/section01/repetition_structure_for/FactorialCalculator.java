package section01.repetition_structure_for;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite um número para calcular o fatorial: ");
		int n = sc.nextInt();
		
		// We start with 1 because it's the neutral element of multiplication 
		int fact = 1;
		
		// The loop calculates: 1 * 2 * 3 * ... * N
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		
		sc.close();

	}

}
