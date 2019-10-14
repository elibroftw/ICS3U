package programs;

import java.util.Scanner;

/**
 * This program will output the value of a compound interest investment, period
 * by period.
 * 
 * @author Elijah Lopez
 */
public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an investement: ");
		double investment = sc.nextDouble();
		System.out.println("For how many years?");
		double year = sc.nextDouble();
		System.out.print("Enter interest rate in decimal: ");
		double rate = sc.nextDouble();
		System.out.println("How many compounding periods per year?");
		double periods = sc.nextDouble();
		rate = rate / periods;
		periods = year * periods;
		for (int i = 1; i <= periods; i++) {
			investment *= (1 + rate);
			investment = Math.round(investment * 100) / 100.0;
			System.out.println("End of Period " + i + " : Principal = $" + investment);
			System.out.println("Enter amount to deposit: ");
			investment += sc.nextDouble();
		}
		sc.close();
	}

}
