package programs;

import java.util.Scanner;

public class PowersOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the power of 2 you would like to go up to");
		int power = sc.nextInt() + 1;
		for (int i = 0; i < power; i++) {
			System.out.println("2^" + i + " = " + (int) Math.pow(2, i));
		}
		sc.close();
	}

}
