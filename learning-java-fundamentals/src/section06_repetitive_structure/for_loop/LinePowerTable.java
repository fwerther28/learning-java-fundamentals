package section06_repetitive_structure.for_loop;

import java.util.Scanner;

public class LinePowerTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			int square = i * i;
			int cube = i * i * i;
			
			// Display the number, it's square, and it's cube separated by spaces
			System.out.println(i + " " + square + " " + cube);
		}
		
	}

}
