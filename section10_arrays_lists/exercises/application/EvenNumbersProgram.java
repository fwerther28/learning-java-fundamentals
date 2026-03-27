package section10_arrays_lists.exercises.application;

import java.util.Scanner;

public class EvenNumbersProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input: Quantity of elements
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		// Vector declaration 
		int[] numbers = new int[n];
		
		// Reading numbers into the vector
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		// Logic to filter and display even numbers
		System.out.println();
		System.out.println("Números pares: ");
		
		int evenCount = 0;
		for (int i = 0; i < n; i++) {
			// Modulo operator to check if even
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
				evenCount++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de pares = " + evenCount);
		
		sc.close();		
	}
}
