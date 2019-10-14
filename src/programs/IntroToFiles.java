package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IntroToFiles {

	/**
	 * @author Elijah Lopez
	 * This program will teach you how to save, write to, and
	 * read from a text file
	 */
	static Scanner sc = new Scanner(System.in);
	static File names; // FILE OBJECT
	static PrintWriter pw; // PRINTWRITE OBJECT

	public static void main(String[] args) throws FileNotFoundException {

		names = new File("names.txt");
		System.out
				.println("Do you want to write to a file or read from a file?");
		System.out.println("Enter 1 to write to OR enter 2 to read from:");
		int choice = sc.nextInt();
		if (choice == 1) {
			pw = new PrintWriter(names);

			String firstName;
			do {
				System.out
						.println("Enter the next name or 'null' to exit. If your name is null, too bad.");
				firstName = sc.next();
				if (!firstName.equals("null")) {
					pw.println(firstName);
				}
			} while (!firstName.equals("null"));
			pw.flush();
			pw.close();
		} else if (choice == 2) {
			Scanner fileRead = new Scanner(names);
			System.out
					.println("OK, the program will print out all the names in the file!");
			while (fileRead.hasNext()) {
				System.out.println(fileRead.nextLine());
			}
			fileRead.close();
		}

	}
}
