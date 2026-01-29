package section06.repetition_structure_while;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int password = sc.nextInt();
		
		// The white loops continues as long as the password in not 2002
		while (password != 2002) {
			System.out.println("Senha inválida");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();

	}

}
