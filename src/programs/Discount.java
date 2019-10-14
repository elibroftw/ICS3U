package programs;

import java.util.Scanner;

/**
 * @author Elijah Lopez
 */
public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter price of the item: ");
		double price = sc.nextDouble();
		System.out.println("");
		System.out.print("Is the item on sale? ");
		String ans = sc.next();
		if (ans.equals("No") && (price > 10.00)) {
			price = 0.9 * price;
			System.out.println("Discounted price = " + price);
		}
		System.out.println("");
		System.out.println("Total Price = $" + (Math.round(price * 113)) / 100.0);
		sc.close();
	}
}