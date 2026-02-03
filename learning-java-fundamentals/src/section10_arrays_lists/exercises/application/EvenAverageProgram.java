package section10_arrays_lists.exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class EvenAverageProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		// Logic to calculate the sum and count of even numbers
		int sumEvens = 0;
		int countEvens = 0;

		for (int i = 0; i < n; i++) {
			if (vect[i] % 2 == 0) {
				sumEvens += vect[i];
				countEvens++;
			}
		}

		// Conditional output
		if (countEvens == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double average = (double) sumEvens / countEvens;
			System.out.printf("MEDIA DOS PARES = %.1f%n", average);
		}
		
		sc.close();
	}
}
