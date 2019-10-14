package programs;

import java.util.Scanner;

public class OtherMethods {

	static Scanner sc = new Scanner(System.in);
	static String first;
	static String last;

	public static void main(String[] args) {

		getUserName();
		greetUser();
		int age = getUserAge();
		String gender = getUserGender();
		finalGreeting(age, gender);
	}

	public static void getUserName() {
		System.out.println("What is your first name?");
		first = sc.next();
		System.out.println("And your last name?");
		last = sc.next();
	}

	public static void greetUser() {
		System.out.println("Hey " + first + " " + last + " How's it going?");

	}

	public static int getUserAge() {
		System.out.println("Ok " + first + ", how old are you?");
		int age = sc.nextInt();
		return age;
	}

	public static String getUserGender() {
		System.out.println("What do you identify as");
		String gender = sc.next();
		return gender;
	}

	public static void finalGreeting(int a, String g) {
		System.out.println("Cool! So you are a " + a + " year old " + g + "!");

	}
}
