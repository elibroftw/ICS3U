/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programs;

/**
 *
 * @author Eli
 */
public class Restaurant {
	public static void main(String[] args) {
		double meal = 10.99;
		double tax = 0.13 * meal;
		double tip = 0.2 * meal;
		System.out.println("Total bill is: " + (meal + tax + tip));
	}
}
