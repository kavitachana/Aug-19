package com.kavita.encryption;

import java.util.ArrayList;

public class Encrypt {

	public static ArrayList<Integer> encryptor(String message) {

		char character;
		int encrypted;
//		int randomAssigner;
		ArrayList<Integer> messageInAscii = new ArrayList<>();

		System.out.print("Your encrypted message is: ");

		for (int i = 0; i < message.length(); i++) {
			character = message.charAt(i);
			int ascii = (int) character;
			messageInAscii.add(ascii);
			encrypted = ascii + (int) (Math.random() * 7) + 2;	//randomize encryption
			
			System.out.print(encrypted + " ");

		}
		
		System.out.println();
		return messageInAscii;
	}

}
