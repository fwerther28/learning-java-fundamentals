package section05.conditional_structure;

import java.util.Scanner;

public class EvenOrOddChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
