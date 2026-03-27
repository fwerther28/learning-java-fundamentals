package section10_arrays_lists.exercises.application;

import java.util.Scanner;

public class VectorSumProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input: Vector size
		System.out.print("Quantos valores terá cada vetor? ");
		int n = sc.nextInt();

		// Vectors declaration
		int[] vectorA = new int[n];
		int[] vectorB = new int[n];
		int[] vectorC = new int[n];

		// Reading values for Vector A
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vectorA[i] = sc.nextInt();
		}

		// Reading values for Vector B
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < n; i++) {
			vectorB[i] = sc.nextInt();
		}

		// Generating Vector C by summing A and B
		for (int i = 0; i < n; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
		}

		// Output: Resulting Vector C
		System.out.println();
		System.out.println("Vetor Resultante: ");
		for (int i = 0; i < n; i++) {
			System.out.println(vectorC[i]);
		}

		sc.close();
	}

}
