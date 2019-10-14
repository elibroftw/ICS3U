package programs;

import java.util.Scanner;

public class TempConvert {

	static double temp;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		getTemp();
		System.out.println("Do you want to convert it to Celsius (enter 1) or Fahrenheit (enter 2)");
		int choice = sc.nextInt();
		if (choice == 1) toCelsius(temp);
		else if (choice == 2) toFahrenheit(temp);
	}

	public static void getTemp() {
		System.out.println("Hi! What temperature do you want to convert?");
		temp = sc.nextDouble();
	}

	public static void toFahrenheit(double c) {
		c = c * 1.8 + 32;
		System.out.println(
				"OK! Your temperature of " + temp + " degrees celsius" + " is equal to " + c + " degrees fahrenheit!");
	}

	public static void toCelsius(double f) {
		f = (f - 32) / 1.8;
		System.out.println(
				"OK! Your temperature of " + temp + " degrees fahrenheit" + " is equal to " + f + " degrees celsius!");
	}
}
