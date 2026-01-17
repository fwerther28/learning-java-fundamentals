package section02.application;

import java.util.Locale;
import java.util.Scanner;

public class PeopleDataProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		double[] heights = new double[n];
		char[] genders = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Altura da " + (i + 1) + "a pessoa: ");
			heights[i] = sc.nextDouble(); 
			System.out.println("Gênero da " + (i + 1) + "a pessoa: ");
			genders[i] = sc.next().toUpperCase().charAt(0);
		}
		
		// Logic for min and max height
		double shortest = heights[0];
		double tallest = heights[0];
		
		for (int i = 1; i < n; i++) {
			if (heights[i] < shortest) {
				shortest = heights[i];
			}
			if (heights[i] > tallest) {
				tallest = heights[i];
			}
		}
		
		// Logic for average female height and counting males
		double femaleSumHeight = 0.0;
		int femaleCount = 0;
		int maleCount = 0;
		
		for (int i = 0; i < n; i++) {
			if (genders[i] == 'F') {
				femaleSumHeight += heights[i];
				femaleCount++;
			} else {
				maleCount++;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", shortest);
		System.out.printf("Maior altura = %.2f%n", tallest);
		
		if (femaleCount == 0) {
			System.out.println("Nao ha mulheres para calcular a média");
		} else {
			double femaleAverage = femaleSumHeight / femaleCount;
			System.out.printf("Média das alturas das mulheres = %.2f%n", femaleAverage);
		}
		
		System.out.println("Numero de homens = " + maleCount);
		
		sc.close();
	}

}
