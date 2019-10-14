package programs;

import java.util.Scanner;

public class EquationDisplay {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("How many values would you like to enter/");
		System.out.println("1 Value: y = a <-- Constant function");
		System.out.println("2 Values: y = ax+b <-- Linear function");
		System.out.println("3 Values: y = ax^2 + bx + c <-- Quadratic function");
		System.out.println("4 Values: y = ax^3 + bx^2 + cx + d <-- Cubic function");
		int values = sc.nextInt();
		double b = 0;
		double c = 0;
		double d = 0;
		System.out.println("Enter a value");
		double a = sc.nextDouble();
		if (values > 1) {
			System.out.println("Enter another value");
			b = sc.nextDouble();
		}
		if (values > 2) {
			System.out.println("Enter another value");
			c = sc.nextDouble();
		}
		if (values > 3) {
			System.out.println("Enter the last value");
			d = sc.nextDouble();
		}
		switch (values) {
		case 1:
			show(a);
			break;
		case 2:
			show(a, b);
			break;
		case 3:
			show(a, b, c);
			break;
		case 4:
			show(a, b, c, d);
			break;
		}
	}

	private static void show(double a) {
		System.out.println("y = " + a);
	}

	private static void show(double a, double b) {
		System.out.println("y = " + a + "x + " + b);
	}

	private static void show(double a, double b, double c) {
		System.out.println("y = " + a + "x^2 + " + "bx" + c);
	}

	private static void show(double a, double b, double c, double d) {
		System.out.println("y = " + a + "x^3 + " + b + "x^2 + " + c + "x + " + d);
	}
}
