package programs;

import java.util.Scanner;

public class HallCost {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {

		final double Rent = 350;
		final double gratuity = 0.20;
		final double tax = 0.13;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of guests: ");
		int guests = sc.nextInt();
		System.out.print("Enter cost per person: ");
		double perperson = sc.nextDouble();
		double cost = guests * perperson + Rent;
		double total = cost * tax + cost * gratuity + cost;
		double roundedTotal = (Math.round(total * 100)) / 100.0;
		System.out.println("Your total is $" + roundedTotal);
		sc.close();
	}

}
