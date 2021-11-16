package org.generation.bonus.security;

import java.util.Scanner;

public class PasswordGeneratorInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = in.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = in.nextLine();
		
		System.out.println("Enter favorite color: ");
		String favColor = in.nextLine();
		
		System.out.println("Enter day of birth: ");
		int day = in.nextInt();
		
		System.out.println("Enter month of birth: ");
		int month = in.nextInt();
		
		System.out.println("Enter year of birth: ");
		int year = in.nextInt();
		
		short birthSum = (short) (day + month + year);
		System.out.println("Password: " + firstName + "-" + lastName + "-" + favColor + "-" + birthSum);
	}

}
