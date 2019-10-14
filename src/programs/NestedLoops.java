package programs;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is the starting value for the base values?");
		int start = sc.nextInt();
		System.out.println("What is the ending value for the base values?");
		int end = sc.nextInt();
		System.out.println("What is the starting value for the exponents?");
		int xpstart = sc.nextInt();
		System.out.println("What is the ending value for the exponents? ");
		int xpend = sc.nextInt();
		for (int j = start; j <= end; j++) {
			for (int i = xpstart; i <= xpend; i++) {
				System.out.print(j + "^" + i + " = " + (int) Math.pow(j, i) + "    ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
