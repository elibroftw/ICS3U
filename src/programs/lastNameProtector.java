package programs;

import java.util.Scanner;

public class lastNameProtector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first and last name:");
		String first = sc.next();
		String last = sc.next();
		String star = "*";
		for (int i = 3; i < last.length(); i++) {
			star += "*";
		}
		String end = last.substring(last.length() - 1);
		last = last.substring(0, 1);
		System.out.println("Encryption successful");
		System.out.println("Welcome " + first + " " + last + star + end);
		sc.close();
	}

}
