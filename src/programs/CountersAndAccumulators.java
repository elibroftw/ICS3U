package programs;

import java.util.Scanner;

public class CountersAndAccumulators {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, Enter in a bunch of numbers and I'll tell you the sum.");
		System.out.println("How many numbers do you want to enter?");
		int counter = sc.nextInt();
		double total = 0;
		double number;
		while (counter > 0) {
			counter--;
			System.out.print("Enter a number: ");
			number = sc.nextDouble();
			total += number;
		}
		System.out.println(total);
		sc.close();
	}

}
