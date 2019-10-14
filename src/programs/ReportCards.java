package programs;

import java.util.Scanner;

/**
 * This program will keep three arrays first name last name grade and will allow
 * the 'teacher' to search for a student's grade
 * 
 * @author Stephen
 * 
 */
public class ReportCards {

	static Scanner input = new Scanner(System.in);
	static String[] firstNames;
	static String[] lastNames;
	static int[] grades;

	public static void main(String[] args) {

		System.out.println("How many students are in the class?");
		int classSize = input.nextInt();

		// Create the three arrays based on the size of the class
		firstNames = new String[classSize];
		lastNames = new String[classSize];
		grades = new int[classSize];

		getData(classSize);
		search();

	}

	public static void getData(int classSize) {

		// Do one 'for' loop where we get the user to input all of the data
		for (int i = 0; i < classSize; i++) {
			System.out.println("Enter the first name of student # " + (i + 1));
			firstNames[i] = input.next();

			System.out.println("Enter the last name of student #" + (i + 1));
			lastNames[i] = input.next();

			System.out.println("Enter the grade of student #" + (i + 1));
			grades[i] = input.nextInt();
		}
	}

	/**
	 * This method will allow the user to search through the database for a student
	 */
	public static void search() {

		int searchChoice;
		String searchName;
		boolean found = false;
		do {
			System.out.println("Would you like to search by first or last name?");
			System.out.println("Enter 1 for first name, or 2 for last name. Enter 0 to exit");
			searchChoice = input.nextInt();
			if (searchChoice == 0) {
				break;
			}

			System.out.println("Enter the name that you want to search for:");
			searchName = input.next();

			// search through the appropriate array
			if (searchChoice == 1) {
				for (int i = 0; i < firstNames.length; i++) {
					// if first name matches, output full name and grade
					if (firstNames[i].equalsIgnoreCase(searchName)) {
						System.out.println(firstNames[i] + " " + lastNames[i] + "'s grade is " + grades[i]);
						found = true;
					}
				}
				// Output a message if NOT FOUND
				if (found == false) {
					System.out.println("Sorry, that student was not found");
				}
			}

			// search through the appropriate array
			else if (searchChoice == 2) {
				for (int i = 0; i < lastNames.length; i++) {
					// if first name matches, output full name and grade
					if (lastNames[i].equalsIgnoreCase(searchName)) {
						System.out.println(firstNames[i] + " " + lastNames[i] + "'s grade is " + grades[i]);
						found = true;
					}
				}
				// Output a message if NOT FOUND
				if (found == false) {
					System.out.println("Sorry, that student was not found");
				}
			}

			else {
				System.out.println("BYE!");
			}

		} while (searchChoice != 0); // The exit condition

	}

}
