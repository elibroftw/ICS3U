package programs;

import java.util.Scanner;

public class LinearCalculator {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the slope of the equation: ");
		double m = sc.nextDouble();
		System.out.print("Enter the y-intercecpt of the line: ");
		double b = sc.nextDouble();
		System.out.print("Enter a value for x: ");
		double x = sc.nextDouble();
		System.out.println(m*x+b);
		sc.close();

	}

}
