package programs;

import java.util.Scanner;

public class IntroToArrays {

	/**
	 * This program will teach you how to define, initialize and populate arrays
	 * And, of course, what they are used for
	 * 
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myFirstArray;
		myFirstArray = new int[10]; // This tells the computer to initialize the
		// array to hold ten integers
		// Populates ten values to 0
		myFirstArray[0] = 25;

		System.out.println("myFirstArray is size " + myFirstArray.length);
		int oneNumber = myFirstArray[0];
		System.out.println(oneNumber);
		// int[] mysecondArray = { 3, 8, 12, 15, -67, 85, 33, -90, 2222, 1 };
		int[] mythirdArray = new int[20];
		for (int i = 0; i < mythirdArray.length; i++) {
			mythirdArray[i] = i * 2;
		}
		for (int i = 0; i < mythirdArray.length; i++) {
			System.out.println("The number at location " + i + " is " + mythirdArray[i]);
		}
		String[] myFirstStringArray = new String[3];
		for (int i = 0; i < myFirstStringArray.length; i++) {
			System.out.println("Enter a fruit");
			myFirstStringArray[i] = sc.next();
		}
		System.out.println("Mr. K's Fruit Salad Recipe");
		System.out.println("13 " + myFirstStringArray[0]);
		System.out.println("ONE SLICE OF " + myFirstStringArray[1]);
		System.out.println("And just a touch of " + myFirstStringArray[2]);
	}

}
