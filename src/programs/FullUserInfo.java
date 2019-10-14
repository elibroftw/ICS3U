package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FullUserInfo {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static PrintWriter pw;
	static File f;

	public static void main(String[] args) throws FileNotFoundException {
		f = new File("UserInfo.txt");
		pw = new PrintWriter("UserInfo.txt");
		String firstName;
		String lastName;
		int account;
		int age;
		do {
			System.out.println("Enter 'First_Name Last_Name Age Accoutnt#' ");
			System.out.println("Enter null null 0 -1 to exit");
			firstName = sc.next();
			lastName = sc.next();
			age = sc.nextInt();
			account = sc.nextInt();
			if (!firstName.equals("null")) {
				pw.print(firstName + " ");
			}
			if (!lastName.equals("null")) {
				pw.print(lastName + " ");
			}
			if (age > 0) {
				pw.print(age + " ");
			}
			if (account >= 0) {
				pw.print(account);
			}
			pw.print("\n");
		} while (!firstName.equals("null") && !lastName.equals("null") && age > 0 && account >= 0);
		pw.flush();
		pw.close();
		Scanner fileRead = new Scanner(f);
		while (fileRead.hasNext()) {
			System.out.print(fileRead.next() + " ");
			System.out.print(fileRead.next() + " ");
			System.out.print(fileRead.nextInt() + " ");
			System.out.println(fileRead.nextInt());
		}
		fileRead.close();
	}

}
