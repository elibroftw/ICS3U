package programs;

import java.util.Scanner;

public class BMICalculator {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height: ");
		double height = sc.nextDouble();
		System.out.print("Enter your weight: ");
		double weight = sc.nextDouble();
		double BMI = weight/(height*height);
		System.out.println(BMI);
		sc.close();

	}

}
