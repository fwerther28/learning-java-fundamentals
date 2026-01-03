package section01.conditional_structure;

import java.util.Scanner;

public class GameDurationCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora inicial e a hora final: ");
		int startTime = sc.nextInt();
		int endTime = sc.nextInt();
		
		int duration;
		
		// If end time is greater than star time, the game happened within the same day.
		// Otherwise, it crossed into the next day (24-hour cycle).
		if (endTime > startTime) {
			duration = endTime - startTime;
		} else {
			duration = 24 - startTime + endTime;
		}
		
		System.out.println("O Jogo durou " + duration + " Hora(s)");
		
		sc.close();
	}
}
