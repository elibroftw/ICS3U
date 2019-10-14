package programs;

import java.util.Scanner;

public class EmailHeaders {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter info as prompted. Enter 'na' if the info is unavailable");

		System.out.print("Enter your first name: ");
		String first = sc.next();

		System.out.print("Enter your last name: ");
		String last = sc.next();

		System.out.print("Enter your gender: ");
		String gender = sc.next().toLowerCase();

		if ((!first.equals("na")) && (!last.equals("na")) && (!gender.equals("na"))) {
			generateHeader(first, last, gender);
		} else if ((!first.equals("na")) && (!last.equals("na"))) {
			generateHeader(first, last);
		} else if ((!gender.equals("na")) && (first.equals("na")) && (last.equals("na"))) {
			generateHeader(gender);
		} else {
			generateHeader();
		}
	}

	private static void generateHeader(String first, String last, String gender) {
		if (gender.equals("male")) {
			System.out.println("Dear Mr. " + first + " " + last + ", ");
		} else {
			System.out.println("Dear Mrs. " + first + " " + last + ", ");
		}
	}

	public static void generateHeader(String first, String last) {
		System.out.println("Dear " + first + " " + last + ", ");
	}

	public static void generateHeader(String gender) {
		if (gender.equals("male")) {
			System.out.println("Dear Sir, ");
		} else {
			System.out.println("Dear Madame, ");
		}
	}

	public static void generateHeader() {
		System.out.println("Dear Sir or Madame, ");

	}
}
