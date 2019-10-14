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
public class HeronFormula {
	public static void main(String[] args) {
		double a = 10;
		double b = 10;
		double c = 10;
		double s = (a + b + c) / 2;
		double temp = s * (s - a) * (s - b) * (s - c);
		System.out.println("The area of the triangle is " + Math.sqrt(temp) + " units squared");
	}
}
