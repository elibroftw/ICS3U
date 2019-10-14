package programs;

import java.util.Scanner;

public class GhettoCalculator {

	/**
	 * This program will use switch and case statements
	 * to provide the user with a list of options to
	 * perform math functions on numbers
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the world's simplest calculator");
		System.out.print("Enter the first number: ");
		double num1 = sc.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = sc.nextDouble();

		System.out.println("What do you want to do with your numbers?");

		System.out.println("1: Add them");
		System.out.println("2: Subtract num1 - num2");
		System.out.println("3: Subtract num2 - num1");
		System.out.println("4: Multiply them");
		System.out.println("5: Divide num1 / num2");
		System.out.println("6: Divide num2 / num1");
		System.out.println("7: Raise num1 to power of num2");
		System.out.println("8: Raise num2 to power of num1");
		System.out.println("Enter a number corresponding to your choice: ");
		int choice = sc.nextInt();
		double result;
		switch (choice) {
        case 1 : result = num1 + num2; break;
        case 2 : result = num1 - num2; break;
        case 3: result = num2 - num1; break;
        case 4: result = num1 * num2; break;
        case 5: result = num1 /num2; break;
        case 6: result = num2 /num1; break;
        case 7: result = Math.pow(num1, num2); break;
        case 8: result = Math.pow(num2, num1); break;
		default:
			result = 0;
			System.out.println("Wrong choice, blockhead");
		}

		System.out.println("The result of your operation is " + result);

		sc.close();
	}

}
