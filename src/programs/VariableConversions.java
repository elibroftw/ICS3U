package programs;

import java.util.Scanner;

public class VariableConversions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (non-decimal)");
		String input1 = sc.next();
		int conversion1 = Integer.parseInt(input1);
		System.out.println("Two times your number is " + (2 * conversion1));

		System.out.println("Enter another number");
		int input2 = sc.nextInt();
		String conversion2 = input2 + "";
		System.out.println("Your number as a string is " + conversion2);
//		char input3 = 'e';
//		String conversion3 = input3 + "";
		char input4 = '4';
		int conversion4 = Character.getNumericValue(input4);
		System.out.println("The character '4; as an integer is " + conversion4);
		sc.close();
	}

}
