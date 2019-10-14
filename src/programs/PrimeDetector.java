package programs;

import java.util.Scanner;

public class PrimeDetector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean go = true;
		System.out.print("Enter the number you want to test as Prime: ");
		int num = sc.nextInt();
		String out = "a prime";
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				out = "not a prime";
			}
		}
		System.out.println("The number is " + out);
		System.out.print("Enter a number to see all primes before it: ");
		num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			for (int j = 2; j < i; j++)
				if (i % j == 0) {
					go = false;
				}
			if (go == true) {
				System.out.println(i);
			}
			go = true;
		}
		sc.close();

	}

}