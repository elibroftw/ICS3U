/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

/**
 *
 * @author Elijah Lopez
 */
public class Change {
	public static void main(String[] args) {
		int change = 479;
		int quarters = change / 25;
		int dimes = (change % 25) / 10;
		int nickels = (change % 25 % 10) / 5;
		int pennies = change % 25 % 10 % 5;
		System.out.println("Enter the Change in cents: " + change + "\n");
		System.out.println("The Minium Number of Coins is:\n");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
	}
}
