package com.kavita.encryption;

import java.util.ArrayList;
import java.util.Scanner;

import com.kavita.decryption.Decrypt;
import com.kavita.utils.Validator;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean contApp = true;
		boolean correctInput = true;
		String menuInput = null;
		String userMessage = null;

		ArrayList<Integer> messageInAscii = new ArrayList<>();

		System.out.println("Hello and welcome to the message encryptor and decryptor application.\n");

		do {
			do {
				helloAndWelcome();
				menuInput = sc.nextLine();

				correctInput = Validator.userInputForMenu(menuInput, correctInput);

			} while (correctInput);

			switch (menuInput) {

			case "1": // encrypt
				System.out.println("Please enter a message to encrypt:");
				userMessage = sc.nextLine();
				messageInAscii = Encrypt.encryptor(userMessage);
				System.out.println();
				break;

			case "2": // decrypt
				Decrypt.decryptor(messageInAscii);
				System.out.println();
				break;

			case "3": // exit
				System.out.println("Thank you for using the encryptor and decryptor application!");
				System.exit(0);
			}

		} while (contApp);
		
		sc.close();
	} // main

	public static void helloAndWelcome() {
		System.out.println("Please selection an option from the menu below: \n");
		System.out.println("1. Encrypt a message.");
		System.out.println("2. Decrypt the message entered in option 1.");
		System.out.println("3. Exit the application.");
	} // helloAndWelcome

}
