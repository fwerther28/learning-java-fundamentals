package section02.application;

import java.util.Locale;
import java.util.Scanner;
import section02.entities.CurrencyConverter;

public class CurrencyProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dólar? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		// Calling the static method form the class
		double result = CurrencyConverter.dollarToReal(amount,dollarPrice);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
	}

}
