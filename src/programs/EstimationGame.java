package programs;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class EstimationGame {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static File f;
	static PrintWriter pw;
	static double[] temp = new double[10];
	static int counter = 0;
	static double score = 0;

	public static void main(String[] args) throws FileNotFoundException {
		int choice;
		f = new File("High Scores - Estimation Game by Eli Lopez.txt");
		do {
			System.out.println("Choose an option:");
			System.out.println("1: Play the game");
			System.out.println("2: View highscores");
			System.out.println("3: Reset highscores");
			choice = sc.nextInt();
			if (choice < 1 || choice > 3) {
				System.out.println("That was not an option!");
			}
		} while (choice < 1 || choice > 3);

		switch (choice) {
		case 1:
			Questions();
			endGame();
			break;
		case 2:
			ViewScores();
			break;
		case 3:
			ResetScores();
			break;
		default:
			System.out.println("Something went wrong");
			break;
		}
	}

	public static void ViewScores() throws FileNotFoundException {
		Scanner fileRead = new Scanner(f);
		System.out.println("HIGHSCORES");

		while (fileRead.hasNext()) {
			counter++;
			System.out.println(counter + ". " + fileRead.nextLine() + "%");
		}
		fileRead.close();

	}

	public static void ResetScores() throws FileNotFoundException {
		pw = new PrintWriter(f);
		for (int i = 0; i < 10; i++) {
			pw.println(10000);
		}
		pw.flush();
		pw.close();
		System.out.println("FILE HAS BEEN RESET");
	}

	public static void Questions() {
		double guess;
		System.out.println("A score less than 10000 is needed to place in the high scores");
		System.out.println("Question 1:\nHow many letters in the greek alphabet");
		guess = sc.nextDouble();
		percentError(24.0, guess);
		System.out.println("Question 2:\nWhen did the French Revolution start");
		guess = sc.nextDouble();
		percentError(1789.0, guess);
		System.out.println("Question 3:\nHow many countries in the world");
		guess = sc.nextDouble();
		percentError(196.0, guess);
		System.out.println("Question 4:\nHow many people were living in the world in 2015 (in thousands)");
		guess = sc.nextDouble();
		percentError(7347000, guess);
		System.out.println("Question 5:\nHow many astronauts have walked the moon");
		guess = sc.nextDouble();
		percentError(12.0, guess);
		System.out.println("Question 6:\nWhat is the world average life expectancy (in years)");
		guess = sc.nextDouble();
		percentError(71.0, guess);
		System.out.println("Question 7:\nHow many types of canadian passports are there?");
		guess = sc.nextDouble();
		percentError(4.0, guess);
		System.out.println("Question 8:\nHow many stars in the USA flag?");
		guess = sc.nextDouble();
		percentError(50.0, guess);
		System.out.println("Question 9:\nHow many people had access to the internet in 2015(in thousands)?");
		guess = sc.nextDouble();
		percentError(3200000, guess);
		System.out.println("Question 10:\nHow many cells in the human body (in millions)");
		guess = sc.nextDouble();
		percentError(37200000, guess);
	}

	public static void endGame() throws FileNotFoundException {
		for (int i = 0; i < 10; i++) {
			System.out.print("Answer to Question " + (i + 1) + ": ");
			System.out.println(temp[i]);
		}
		double percent = Math.round(score * 100) / 100.0;
		if (percent < 100) {
			System.out.print("Well Done!");
		} else if (percent > 3000) {
			System.out.print("Were you drunk today?");
		} else {
			System.out.print("Nice job!");
		}
		System.out.println(" Your final score is: " + percent + "%");
		Scanner fileRead = new Scanner(f);
		counter = 0;
		while (fileRead.hasNext()) {
			temp[counter] = fileRead.nextDouble();
			counter++;
		}
		fileRead.close();
		counter = -1;
		if (percent < temp[9]) {
			temp[9] = percent;
			Arrays.sort(temp);
			do {
				counter++;
				if (temp[counter] == percent) {
					System.out.println("You placed " + (counter + 1) + " in high scores");
				}
			} while (temp[counter] != percent);
			pw = new PrintWriter(f);
			for (int i = 0; i < temp.length; i++) {
				pw.println(temp[i]);
			}
			pw.flush();
			pw.close();
		}
	}

	public static void percentError(double correct, double guess) {
		double Percent_error = Math.abs((correct - guess) / correct * 100.0);
		temp[counter] = correct;
		score += Percent_error;
		counter++;
	}
}
