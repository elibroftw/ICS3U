package programs;

import java.util.Scanner;

public class RandomLetters {

	/**
	 * This program will ouput a random grid of letters mimichking a "Word Search"
	 * ... without words.
	 * @author Elijah Lopez
	 */
	static Scanner sc = new Scanner(System.in);
	static int height, width;
	static char[][] words;

	public static void main(String[] args) {

//		char test1 = 'a';
//		char test2 = 97;
//		System.out.println(test1);
//		System.out.println(test2);
		getDimensions();
		generateLetters();
	}

	private static void generateLetters() {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				words[i][j] = (char) (int) (Math.random() * 26 + 97);
			}
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(words[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static void getDimensions() {
		System.out.println("What do you want the height of the word search to be?");
		height = sc.nextInt();
		System.out.println("And the width?");
		width = sc.nextInt();
		words = new char[height][width];

	}

}
