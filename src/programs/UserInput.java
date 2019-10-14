package programs;

import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String FirstName = sc.next();

		System.out.print("Enter your last name: ");
		String LastName = sc.next();

		System.out.print("Enter your phone number without any spaces, brackets and dashes: ");
		long Pnumber = sc.nextLong();
		System.out.println("What's up, " + FirstName + "?");
		System.out.print("I tried calling you at " + Pnumber + ", ");
		System.out.println("but I got your dad, Mr. " + LastName + "!");
		sc.close();
	}

}
