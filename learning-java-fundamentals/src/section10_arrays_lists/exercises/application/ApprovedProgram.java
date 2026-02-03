package section10_arrays_lists.exercises.application;

import java.util.Locale;
import java.util.Scanner;

public class ApprovedProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();

		// Parallel vectors for names and grades
		String[] names = new String[n];
		double[] firstGrades = new double[n];
		double[] secondGrades = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			sc.nextLine(); // Buffer cleaning
			names[i] = sc.nextLine();
			firstGrades[i] = sc.nextDouble();
			secondGrades[i] = sc.nextDouble();
		}

		System.out.println("Alunos aprovados:");

		// Logic to calculate average and check approval
		for (int i = 0; i < n; i++) {
			double average = (firstGrades[i] + secondGrades[i]) / 2.0;

			if (average >= 6.0) {
				System.out.println(names[i]);
			}
		}
		
		sc.close();
	}
}
