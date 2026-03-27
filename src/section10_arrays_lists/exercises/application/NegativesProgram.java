package section10_arrays_lists.exercises.application;

import java.util.Scanner;

public class NegativesProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Input: Number of elements (N)
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		
		// Vector declaration 
		int[] numbers = new int[n];
		
		// Loop to read and store numbers in the vector
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		
		// Output: Filtering and displaying negative numbers
		System.out.println("Numero negativos: ");
		for (int i = 0; i < n; i++) {
			if (numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
		
		sc.close();
	}

}
