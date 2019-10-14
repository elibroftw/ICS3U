package programs;

import java.util.Scanner;

public class RightAngleTriangle {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side a: ");
		double a = sc.nextDouble();
		System.out.print("Enter side b: ");
		double b = sc.nextDouble();
		double c = Math.sqrt(a * a + b * b);
		System.out.println(c);
		sc.close();
	}

}
