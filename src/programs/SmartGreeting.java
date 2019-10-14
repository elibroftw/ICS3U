package programs;

import java.util.Scanner;

public class SmartGreeting {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Welcome, user! Please answer a couple of questions");
		System.out.println("So I cant greet you properly");
		System.out.println("Do you identify as male, female or other");
		System.out.println("Type 'male', 'female' or 'other'");
		String gender = sc.next();
		String title;
		if (gender.equals("male")) {
			title = "Mr. ";
		} else if (gender.equals("female")) {
			title = "Ms. ";
		} else if (gender.equals("other")) {
			System.out.println("What is your preferred title?");
			title = sc.next();
		} else {
			System.out.println("Error = that was not an ooption");
			title = "unspecified";
		}
		System.out.println("Please specify your last name");
		String last_name = sc.next();
		System.out.println("Hello " + title + last_name);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		String greeting;
		if (age < 12) {
			greeting = "Have a good time at elementary school today.";
		} else if ((age > 12) && (age <= 19)) {
			greeting = "Enjoy your five hours on League/DOTA/Minecraft tonight.";
		} else if ((age > 19) && (age <= 50)) {
			greeting = "Don't worry, this doesn't cost anything - I know you're broke.";
		} else {
			greeting = "You know this is a computer right?";
		}
		System.out.println("Welcome, " + title + last_name + "!");
		System.out.println(greeting);
		sc.close();
	}
}
