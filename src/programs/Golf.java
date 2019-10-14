package programs;

import java.util.Scanner;

public class Golf {

	/**
	 * @author Elijah Lopez
	 */
	static Scanner sc = new Scanner(System.in);
	static int[] pars;
	static int[] scores;
	static int difference;

	public static void main(String[] args) {
		getNumberOfHoles();
		enterPars();
		enterScores();
	}

	public static void getNumberOfHoles() {
		System.out.println("How many holes of golf are you playing");
		int holes = sc.nextInt();
		pars = new int[holes];
		scores = new int[holes];

	}

	public static void enterPars() {
		for (int i = 0; i < pars.length; i++) {
			System.out.println("Enter in the par for hole #" + (i + 1));
			pars[i] = sc.nextInt();

		}
	}

	public static void enterScores() {
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter your score for hole #" + (i + 1));
			scores[i] = sc.nextInt();
			statistics();
		}
	}

	public static void statistics() {
		int totalPar = 0;
		int totalscore = 0;
		for (int i = 0; i < pars.length; i++) {
			totalPar += pars[i];
			totalscore += scores[i];
		}
		String keyword;
		if (totalscore < totalPar) {
			keyword = " under";
		} else if (totalscore == totalPar) {
			keyword = " at";
		} else {
			keyword = " over";
		}
		difference = Math.abs(totalscore - totalPar);
		System.out.println("You scored " + difference + keyword + " par!");
	}

}
