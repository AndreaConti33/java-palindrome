package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = scanner.nextLine();
		String parolaInversa = "";
		char ch;
		System.out.println("Hai digitato: " + parola + ".");
		for (int i = 0; i < parola.length(); i++) {
			ch = parola.charAt(i);
			parolaInversa = ch + parolaInversa;
		}

		if (parola.equals(parolaInversa)) {
			System.out.println("E' un palindromo");
		} else {
			System.out.println("Non è un palindromo.");
		}
		scanner.close();
	}

}
