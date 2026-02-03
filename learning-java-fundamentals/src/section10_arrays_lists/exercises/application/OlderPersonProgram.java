package section10_arrays_lists.exercises.application;

import java.util.Scanner;

public class OlderPersonProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você irá digitar? ");
		int n = sc.nextInt();

		// Parallel vectors
		String[] names = new String[n];
		int[] ages = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine(); // Buffer cleaning
			names[i] = sc.nextLine();
			System.out.print("Idade: ");
			ages[i] = sc.nextInt();
		}

		// Logic to find the index of the oldest person
		int maxAge = ages[0];
		int oldestPosition = 0;

		for (int i = 1; i < n; i++) {
			if (ages[i] > maxAge) {
				maxAge = ages[i];
				oldestPosition = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + names[oldestPosition]);

		sc.close();
	}

}
