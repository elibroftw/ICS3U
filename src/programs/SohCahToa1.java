package programs;

import java.util.Scanner;

public class SohCahToa1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Input the angle: ");
		double angle_A = sc.nextDouble();
		System.out.print("Input the opposite side length: ");
		double A = sc.nextDouble();
		double adj = A / Math.tan(Math.toRadians(angle_A));
		double hyp = A / Math.sin(Math.toRadians(angle_A));
		System.out.println("The adjacent side length is " + adj);
		System.out.println("The hypotenuse side length is " + hyp);
		sc.close();
	}

}
