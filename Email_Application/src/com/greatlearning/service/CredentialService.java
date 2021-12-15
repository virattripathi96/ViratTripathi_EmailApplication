package com.greatlearning.service;

import java.util.Random;

public class CredentialService {

	public String generateEmailAddress(String firstName, String lastName, String department) {
		//firstNamelastName@depatment.company.com
		return firstName+lastName+"@"+department+".iris.com";

	}
	public String generatePassword() {
		String numbers = "1234567890";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialCharacters = "!@#$%^&*+-/*()<>?";
		String values = numbers+smallLetters+capitalLetters+specialCharacters;
		Random random = new Random();
		char[] password = new char[8];
		for (int i=0; i<8; i++); {
			int i = 0;
			password[i] = values.charAt(random.nextInt(values.length()));
			//random.nextInt(values.length() --> returns the random number from 0 to values.length()
			// charAt returns the character at the index
		}
		
		return password.toString();
	}

}
