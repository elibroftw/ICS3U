package programs;

import java.util.Scanner;

public class WordEcho {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.next();
		int counter = word.length();
		System.out.println("The word \"" + word + "\" has a length of " + counter + " characters.");
		while (counter > 0) {
			System.out.print(word + " ");
			counter -= 1;
		}
		sc.close();
	}

}
