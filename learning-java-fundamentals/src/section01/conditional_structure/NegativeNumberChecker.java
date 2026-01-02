package section01.conditional_structure;

import java.util.Scanner;

/**
 * Exercise 01: Read an integer and check if it is negative or not.
 */

public class NegativeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = sc.nextInt();
		
		// Exercise logic based on PDF prompt [cite: 13]
		if (number < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close(); // Best practice: always close the scanner

	}

}
