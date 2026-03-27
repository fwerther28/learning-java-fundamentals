package section08_introduction_oo_exercises.static_members.currency_converter.application;

import java.util.Locale;
import java.util.Scanner;

import section08_introduction_oo_exercises.static_members.currency_converter.entities.CurrencyConverter;

public class CurrencyProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual é o preço do dólar? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		// Calling the static method form the class
		double result = CurrencyConverter.dollarToReal(amount,dollarPrice);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
	}

}
