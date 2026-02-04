package section10_arrays_lists.exercises.application;

import java.util.Locale;
import java.util.Scanner;

import section10_arrays_lists.exercises.entities.Person;

public class HeightsProgram {

	// Program to read data and calculate statistics (average height and percentage of minors)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		// Array of objects 
		Person[] people = new Person[n];
		
		// Data entry
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa");
			System.out.print("Nome: ");
			sc.nextLine(); // Buffer cleaning
			String name = sc.nextLine();
			System.out.print("Idade: "); 
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			// Instantiating the objects in the array position
			people[i] = new Person(name, age, height);
			
			System.out.println();
		}
		
		// Calculating average height and percentange of minors
		double totalHeight = 0.0;
		int minorsCount = 0;
		
		for (int i = 0; i < n; i++) {
			totalHeight += people[i].getHeight();
			if (people[i].getAge() < 16) {
				minorsCount++;
			}
		}
		
		double averageHeight = totalHeight / n;
		double percentMinors = (double) minorsCount / n * 100.0;
		
		System.out.printf("%nAltura média: %.2f%n", averageHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentMinors);
		
		// Listing names of minors
		for (int i = 0; i < n; i++) {
			if (people[i].getAge() < 16) {
				System.out.println(people[i].getName());
			}
		}
		
		sc.close();
	}
}
