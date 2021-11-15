package org.generation.bonus.security;

import java.util.Scanner;

public class PasswordGeneratorInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardFirstName = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = keyboardFirstName.nextLine();
		
		Scanner keyboardLastName = new Scanner(System.in);
		System.out.println("Enter last name: ");
		String lastName = keyboardLastName.nextLine();
		
		Scanner keyboardFavColor = new Scanner(System.in);
		System.out.println("Enter favorite color: ");
		String favColor = keyboardFavColor.nextLine();
		
		Scanner keyboardDay = new Scanner(System.in);
		System.out.println("Enter day of birth: ");
		int day = keyboardDay.nextInt();
		
		Scanner keyboardMonth = new Scanner(System.in);
		System.out.println("Enter month of birth: ");
		int month = keyboardMonth.nextInt();
		
		Scanner keyboardYear = new Scanner(System.in);
		System.out.println("Enter year of birth: ");
		int year = keyboardYear.nextInt();
		
		short birthSum = (short) (day + month + year);
		System.out.println("Password: " + firstName + "-" + lastName + "-" + favColor + "-" + birthSum);
	}

}
