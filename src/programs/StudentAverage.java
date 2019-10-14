package programs;

import java.util.Scanner;

/**
 * @author Elijah Lopez
 */
public class StudentAverage {

	static double total = 0.0;
	static Scanner sc = new Scanner(System.in);
	static String name;

	public static void main(String[] args) {
		System.out.println("Enter Students Name: ");
		name = sc.next();
		System.out.println("Do you know how many marks to enter? (Y/N)");
		String option = sc.next().toLowerCase();
		if (option.equals("y")) {
			System.out.println("How many marks?");
			int marks = sc.nextInt();
			calculate(marks);
		} else {
			calculate();
		}
	}

	private static void calculate() {
		double mark = 0;
		int marks = -1;
		do {
			total += mark;
			System.out.println("Enter a mark, if all marks have been done enter a number less than 0");
			mark = sc.nextDouble();
			marks++;
		} while (mark >= 0);
		System.out.println(name + "'s average: " + (total / marks));

	}

	private static void calculate(int marks) {
		for (int i = 0; i < marks; i++) {
			System.out.print("Enter mark: ");
			total += sc.nextDouble();
		}
		System.out.println(name + "'s average: " + (total / marks));
	}

}
