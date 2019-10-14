package programs;

import java.util.Scanner;

/**
 * @author Elijah Lopez
 */
public class Countby {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the count by... Where you can count by any number at all!");
		System.out.println("Do you want to count down or up, 0 for down and 1 for up");
		int choice = sc.nextInt();
		int start;
		int end;
		if (choice == 0) {
			do {
				System.out.print("Enter the starting number: ");
				start = sc.nextInt();
				System.out.print("Enter the ending number: ");
				end = sc.nextInt();
				if (start <= end) {
					System.out.println("Ending number must be smaller than the starting number");
				}
			} while (start <= end);
			System.out.println("what do want to count down by?");
			int multiple = sc.nextInt();
			int counter = start;
			while (counter >= end) {
				System.out.println(counter);
				counter = counter - multiple;
			}
		} else {
			do {
				System.out.print("Enter the starting number: ");
				start = sc.nextInt();
				System.out.print("Enter the ending number: ");
				end = sc.nextInt();
				if (start >= end) {
					System.out.println("Ending number must be larger than the starting number");
				}
			} while (start >= end);
			System.out.println("what do want to count up by?");
			int multiple = sc.nextInt();
			int counter = start;
			while (counter <= end) {
				System.out.println(counter);
				counter = counter + multiple;
			}
		}

		sc.close();
	}

}
