package programs;

import java.util.Scanner;

public class Forloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to start at: ");
		int start = sc.nextInt();

		System.out.print("Enter the number to end at: ");
		int end = sc.nextInt();

		boolean upFlag;
		if (start <= end) {
			upFlag = true;
		} else {
			upFlag = false;
		}
		System.out.print("Enter the number to count up by: ");
		int count = sc.nextInt();

		if (upFlag == true) {
			for (int i = start; i <= end; i += count) {
				System.out.println(i);
			}
		} else if (upFlag == false) {
			for (int i = start; i >= end; i -= count) {
				System.out.println(i);
			}
		} else {
			System.out.println("WHOOPS");
		}
		// CLASS.PrimeDetector(args) to call another file
		sc.close();
	}
}
