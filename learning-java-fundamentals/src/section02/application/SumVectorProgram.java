package section02.application;

import java.util.Locale;
import java.util.Scanner;

public class SumVectorProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Input: Quantity of numbers
		System.out.println("Quantos números vai digitar? ");
		int n = sc.nextInt();
		
		// Vector declaration 
		double[] numbers = new double[n];
		
		// Reading numbers and storing in the vector
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			numbers[i] = sc.nextDouble();
		}
			
		// Calculating sum
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += numbers[i];
		}
		
		// Calculating average
		double average = sum / n;
		
		System.out.println();
		
		// Output: Displaying values 
		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f", numbers[i]);
			if (i < n - 1)
				System.out.print(" ");
		}
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n", sum);
		System.out.printf("MEDIA = %.2f%n", average);
		
		sc.close();
	}

}
