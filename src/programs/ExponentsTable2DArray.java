package programs;

import java.util.Scanner;

public class ExponentsTable2DArray {

	/**
	 * @author Elijah Lopez
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("What base would you like the exponents to have?");
		int base = sc.nextInt();

		System.out.println("What is the lowest exponent you want to calculate?");
		int lowExp = sc.nextInt();

		System.out.println("What is the highest exponent you want to calculate?");
		int highExp = sc.nextInt();

		int range = highExp - lowExp;
		int[][] results = new int[2][range + 1];

		for (int i = 0; i < results[0].length; i++) {
			results[0][i] = i + lowExp;
		}
		for (int i = 0; i < results[0].length; i++) {
			results[1][i] = (int) Math.pow(base, results[0][i]);

		}
		for (int i = 0; i < results.length; i++) {
			for (int j = 0; j < results[0].length; j++) {
				System.out.println("location " + i + ", " + j + " = " + results[i][j]);
			}
		}
		for (int i = 0; i < results[0].length; i++) {
			System.out.println(base + "^" + results[0][i] + " = " + results[1][i]);

		}
	}

}
