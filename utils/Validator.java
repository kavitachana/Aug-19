package com.kavita.utils;

public class Validator {

	public static boolean userInputForMenu(String menuInput, boolean correctInput) {
		switch (menuInput) {
		case "1":
		case "2":
		case "3":
			correctInput = false;
			break;
		default:
			System.out.println("I'm sorry that is not a valid option\n");
		}
		return correctInput;
	} 
	
}
