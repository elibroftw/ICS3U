package programs;

import java.util.Scanner;

public class FunWithStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = sc.next();
		System.out.print("Enter another word: ");
		String word2 = sc.next();
		String word3 = word.concat(word2);
		System.out.println(word3);
		System.out.print("Enter yes: ");
		String response = sc.next();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("That's an affirmative!");
		} else {
			System.out.println("I said enter yes!!");
		}
		System.out.print("Enter a word that has a vowel: ");
		String vowel = sc.next();
		if (vowel.contains("a")) {
			System.out.println("Your word contains an a!");
		}
		if (vowel.contains("e")) {
			System.out.println("Your word contains an e!");
		}
		if (vowel.contains("i")) {
			System.out.println("Your word contains an i!");
		}
		if (vowel.contains("o")) {
			System.out.println("Your word contains an o!");
		}
		if (vowel.contains("u")) {
			System.out.println("Your word contains an u!");
		}
		System.out.print("Enter a word witha the letter w: ");
		word = sc.next();
		int location = word.indexOf("w");
		System.out.println("The w is letter #" + (location + 1));
		System.out.print("Enter a word with 5 letters exactly: ");
		word = sc.next();
		String sub = word.substring(1, 3);
		System.out.println(sub);
		System.out.print("type in the word darn: ");
		word = sc.next();
		String out = word.replace("arn", "***");
		System.out.println(out);
		sc.close();
	}

}
