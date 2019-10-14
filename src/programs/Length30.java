package programs;

import java.util.Scanner;

public class Length30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first word: ");
		String word = sc.next();
		System.out.print("Enter second word: ");
		String word2 = sc.next();
		String word3 = word + word2;
		int counter = (30 - word3.length());
		System.out.print(word);
		while (counter > 0) {
			System.out.print(".");
			counter -= 1;
		}
		System.out.println(word2);
		sc.close();
	}
}
