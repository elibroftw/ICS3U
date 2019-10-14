package programs;

import java.io.*;
import java.util.Scanner;

/**
 * @author Elijah Lopez
 */
public class AnswerKeyByElijahLopez {
	static File f;
	static PrintWriter pw;
	static Scanner sc = new Scanner(System.in);
	static int times, choices;
	static String fileName;
	static char[] key;
	static char temp;

	public static void main(String[] args) throws FileNotFoundException {
		getInfo();
		getFileName();
		generateLetterArray();
		writeToFile();
	}

	// 97
	private static void getInfo() {
		do {
			System.out.println("Enter a number above 0 for the number of questions");
			times = sc.nextInt();
		} while (times < 1);
		do {
			System.out.println("Enter a number between 2 and 6 inclusive for the number choices per question");
			choices = sc.nextInt();
		} while (choices < 2 || choices > 6);
	}

	private static void getFileName() throws FileNotFoundException {
		System.out.println("Enter a file name:");
		fileName = sc.next() + ".txt";
		f = new File(fileName);
		pw = new PrintWriter(f);
	}

	private static void generateLetterArray() {
		key = new char[times];
		int num;
		for (int i = 0; i < times; i++) {
			num = (int) (Math.random() * choices) + 65;
			temp = (char) num;
			key[i] = temp;
		}
	}

	private static void writeToFile() throws FileNotFoundException {
		pw = new PrintWriter(f);
		for (int i = 0; i < times; i++) {
			pw.println(key[i]);
		}
		pw.flush();
		pw.close();
	}
}
