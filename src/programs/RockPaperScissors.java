package programs;

import java.util.Scanner;

public class RockPaperScissors {

	/**
	 * This program will pit man vs. machine in an epic battle of Rock Paper
	 * Scissors Lizard Spock
	 * 
	 * @param args
	 * @author Elijah Lopez
	 */
	static Scanner sc = new Scanner(System.in);
	static int pscore = 0;
	static int cscore = 0;;

	public static void main(String[] args) {
		greetAndInstruct();
		do {
			String pChoice = getPlayerChoice();
			String cChoice = getCompChoice();
			System.out.println(whoWins(pChoice, cChoice));
			System.out.println("Computer choice: " + cChoice);
			System.out.println("Your choice: " + pChoice);
		} while (pscore < 4 && cscore < 4);
		endScreen();
	}

	private static void endScreen() {
		if (pscore == 4) {
			System.out.println("You beat the computer!");
		} else {
			System.out.println("You lost against the computer");
		}
	}

	public static void greetAndInstruct() {
		System.out.println("Welcome to rock paper scissors lizard spock!");
		System.out.println("When prompted, type in one of the five options");
		System.out.println("The computer will randomly generate a choice as well");
		System.out.println("BEST of 7 WINS!");
	}

	public static String getPlayerChoice() {
		String choice;
		do {
			System.out.print("Enter your throw: ");
			choice = sc.next().toLowerCase();
			if ((choice.equals("rock") == false) && (choice.equals("scissors") == false)
					&& (choice.equals("paper") == false) && (choice.equals("lizard") == false)
					&& (choice.equals("spock") == false)) {
				System.out.println("Please try again");
			}
		} while ((choice.equals("rock") == false) && (choice.equals("scissors") == false)
				&& (choice.equals("paper") == false) && (choice.equals("lizard") == false)
				&& (choice.equals("spock") == false));
		return choice;
	}

	public static String getCompChoice() {
		int choice = (int) (Math.random() * 5) + 1;
		switch (choice) {
		case 1:
			return "rock";
		case 2:
			return "paper";
		case 3:
			return "scissors";
		case 4:
			return "lizard";
		case 5:
			return "spock";
		default:
			return "ERROR";
		}
	}

	public static String whoWins(String user, String comp) {
		if (user.equals("rock")) {
			if (comp.equals("paper")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("rock")) {
				return "Draw!";
			}
			if (comp.equals("scissors")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("lizard")) {
				pscore++;
				return "You win!!";
			}
			if (comp.equals("spock")) {
				cscore++;
				return "Computer wins!";
			}
		} else if (user.equals("paper")) {
			if (comp.equals("paper")) {
				return "Draw!";
			}
			if (comp.equals("rock")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("scissors")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("lizard")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("spock")) {
				pscore++;
				return "You win!";
			}
		} else if (user.equals("scissors")) {
			if (comp.equals("paper")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("rock")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("scissors")) {
				return "Draw!";
			}
			if (comp.equals("lizard")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("spock")) {
				cscore++;
				return "Computer wins!";
			}
		} else if (user.equals("lizard")) {
			if (comp.equals("paper")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("rock")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("scissors")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("lizard")) {
				return "Draw!";
			}
			if (comp.equals("spock")) {
				pscore++;
				return "You win!";
			}
		} else if (user.equals("spock")) {
			if (comp.equals("paper")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("rock")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("scissors")) {
				pscore++;
				return "You win!";
			}
			if (comp.equals("lizard")) {
				cscore++;
				return "Computer wins!";
			}
			if (comp.equals("spock")) {
				return "Draw!";
			}
		}
		return "Something went wrong";
	}
}