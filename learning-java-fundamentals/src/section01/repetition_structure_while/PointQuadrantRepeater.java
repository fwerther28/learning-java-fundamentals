package section01.repetition_structure_while;

import java.util.Scanner;

public class PointQuadrantRepeater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas X e Y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// The loop continues as long as BOTH x and y are different from zero
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
