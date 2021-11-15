package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Luca";
		String lastName = "Il-Grande";
		String favColor = "Purple";
		short day = 26;
		short month = 7;
		short year = 1996;
		
		short birthSum = (short) (day + month + year);
		System.out.println("Password: " + firstName + "-" + lastName + "-" + favColor + "-" + birthSum);
	}

}
