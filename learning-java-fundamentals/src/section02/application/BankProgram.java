package section02.application;

import java.util.Locale;
import java.util.Scanner;

import section02.entities.Account;

public class BankProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Entre com o número da conta: ");
		int number = sc.nextInt();
		System.out.println("Entre com o titular da conta: ");
		sc.nextLine(); // Buffer cleaning
		String holder = sc.nextLine();
		System.out.println("Haverá depósito inicial (s/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 's') {
			System.out.println("Entre com o valor do depósito inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Entre com o valor do depósito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados da conta atualizações:");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Entre com o valor para saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados da conta atualizados:");
		System.out.println(account);
		
		sc.close();	
	}
}
