package programs;

import java.util.Scanner;

public class CountingVowels {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sentence: ");
		String word;
		int vowel = 0;
		do {
			word = sc.next();
			if (word.contains("a") || word.contains("A")) {
				vowel++;
			}
			if (word.contains("e") || word.contains("E")) {
				vowel++;
			}
			if (word.contains("i") || word.contains("I")) {
				vowel++;
			}
			if (word.contains("o") || word.contains("O")) {
				vowel++;
			}
			if (word.contains("u") || word.contains("U")) {
				vowel++;
			}
		} while (word.contains(".") || word.contains("?") || word.contains("!"));
		System.out.println("There are " + vowel + " vowels in the sentence");
		sc.close();
	}

}
