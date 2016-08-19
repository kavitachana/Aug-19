package com.kavita.decryption;

import java.util.ArrayList;

public class Decrypt {

	public static void decryptor(ArrayList<Integer> messageInAscii) {
		
		char decryptedLetter;
		int eachAscii = 0;

		System.out.print("Your decrypted message is: ");
		
		for (int i = 0; i < messageInAscii.size(); i++) {

			eachAscii = messageInAscii.get(i);
			decryptedLetter = (char) eachAscii;

			System.out.print(decryptedLetter);

		}

		System.out.println();
	}

}
