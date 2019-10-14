package programs;

import java.util.Scanner;

public class GuessNumber {

	static Scanner sc = new Scanner(System.in);
	static int guess;
	static int num;

	public static void main(String[] args) {
		num = generateNumber();
		System.out.println("Guess the number between 1 and 10");
		System.out.println(trials());
	}

	private static String highLowOrRight(int guess, int num) {
		if (guess > num) {
			return "Your guess is high";
		} else if (guess < num) {
			return "Your guess is low";
		} else {
			return "correct";
		}
	}

	public static int generateNumber() {
		int num = (int) (Math.random() * 10 + 1);
		return num;
	}

	public static void getUserGuess() {
		guess = sc.nextInt();
	}

	public static String trials() {
		int tries = 5;
		String correct;
		do {
			tries--;
			getUserGuess();
			correct = highLowOrRight(guess, num);
			System.out.println(correct);
			if (correct.equals("correct")) {
				return "Great job";
			} else {
				System.out.println("Try again. You have " + tries + " guesses left");
			}
		} while (correct.equals("correct") == false && tries > 0);
		System.out.println("The number was " + num);
		return "No more gueeses for you";
	}
}
