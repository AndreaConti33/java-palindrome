package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci una parola: ");
		String parola = scanner.nextLine();
		System.out.println("Hai digitato: " + parola);
		String nparola = "";
		char ch;
		
		for (int i = 0; i < parola.length(); i++) {
			ch = parola.charAt(i);
			nparola = ch + nparola;
		}
		
		if(parola.equals(nparola)) {
			System.out.println("E' palindromo");
		} else {
			System.out.println("Non è palindromo");
		}
		
		System.out.println(nparola);
			
		scanner.close();
		}

}
