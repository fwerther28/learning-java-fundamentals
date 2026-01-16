package section02.application;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverageProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Input: Vector size
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		// Vector declaration 
		double[] vect = new double[n];
		
		// Reading values and calculating sum
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		// Calculating average
		double avg = sum / n;
		
		System.out.println();
		System.out.printf("Media do vetor = %.3f%n", avg);
		System.out.println("Elementos abaixo da média:");
		
		// Filtering elements below average
		for (int i = 0; i < n; i++) {
			if (vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();

	}

}
