package section17_set_exercise.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Use Integer because IDs are usually whole numbers
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			courseA.add(id);
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			courseB.add(id);
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			courseC.add(id);
		}
		
		// To find the total unique students, we join all sets
		Set<Integer> totalStudents = new HashSet<>(courseA);
		totalStudents.addAll(courseB);
		totalStudents.addAll(courseC);
		
		System.out.println("Total students: " + totalStudents.size());
		
		sc.close();
	}
}
