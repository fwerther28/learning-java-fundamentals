package section02.application;

import java.util.Locale;
import java.util.Scanner;
import section02.entities.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Creating the object 'rect' based on the 'Rectangle' mold
		Rectangle rect = new Rectangle();
		
		System.out.println("Entre com a largura e altura do retângulo: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		System.out.printf("Área = %.2f%n", rect.area());
		System.out.printf("Perímetro = %.2f%n", rect.perimeter());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());
	}

}
