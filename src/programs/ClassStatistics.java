package programs;

import java.util.Scanner;

public class ClassStatistics {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = sc.nextInt();
		System.out.println("Enter the first student's mark: ");
		double highest = sc.nextDouble();
		double total = highest;
		double lowest = highest;
		double mark;
		for (int i = 1; i < students; i++) {
			System.out.println("Enter the next student's mark: ");
			mark = sc.nextDouble();
			total += mark;
			if (mark > highest) {
				highest = mark;
			}
			if (mark < lowest) {
				lowest = mark;
			}
		}
		System.out.println("The lowest mark is: " + lowest + "%");
		System.out.println("The highest mark is: " + highest + "%");
		System.out.println("The class average is: " + ((Math.round(total / (double) students * 100.0)) / 100.0) + "%");
		sc.close();
	}

}
