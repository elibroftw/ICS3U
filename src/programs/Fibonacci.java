package programs;

import java.util.Scanner;

public class Fibonacci {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many terms of the fibonacci sequence do you want to see?");
		int terms = sc.nextInt();

		int num1 = 0;
		int num2 = 1;

		System.out.println(num1);
		System.out.println(num2);
		int num3;
		for (int i = 1; i < terms - 1; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;

		}
		sc.close();

	}

}
