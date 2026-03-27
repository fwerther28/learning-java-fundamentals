package section10_arrays_lists.exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class HighestPositionProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você irá digitar? ");
		int n = sc.nextInt();
		
		// Vector of doubles
		double[] numbers = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
		
		// Logic to find the highest value and its position
		double highestValue = numbers[0];
		int position = 0;
		
		for (int i = 1; i < n; i++) {
			if (numbers[i] > highestValue) {
				highestValue = numbers[i];
				position = i;
			}
		}
		
		System.out.println();
		System.out.printf("Maior valor = %.1f%n", highestValue);
		System.out.print("Posição do maior valor = " + position);
	}

}
