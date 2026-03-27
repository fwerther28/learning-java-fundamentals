package section10_arrays_lists.exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverageProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		// Array declaration using double to accept decimal values
		double[] vect = new double[n];

		// Data entry loop
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		// Calculating the sum of all elements to find the average
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		// Output the overall average with 3 decimal places
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", avg);

		// Filter and display elements that are strictly below the average
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < n; i++) {
			if (vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}
}
