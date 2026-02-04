package section06_repetitive_structure.for_loop;

import java.util.Scanner;

public class IntervalCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		// The loop runs exactly 'n' times
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			// Check if x is within the interval [10,20]
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(in + " out");
		
		sc.close();

	}

}
