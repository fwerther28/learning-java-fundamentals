package section06_repetitive_structure.for_loop;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverageCalculator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos casos de teste você vai digitar?");
		int n = sc.nextInt();
		
		// The loop runs 'n' times, each time reading 3 numbers
		for (int i = 0; i < n; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			
			// Weighted average calculation (V1*W1 + V2*W2 + V3*W3) / (Total Weights)
			double average = (v1 * 2.0 + v2 * 3.0 + v3 * 5.0) / 10.0;
		
			// Display the result with 1 decimal place
			System.out.printf("%.1f%n", average);
		}
		
		sc.close();
	}
}
