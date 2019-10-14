package programs;

import java.util.Scanner;

public class Minesweeper {

	static Scanner sc = new Scanner(System.in);
	static int x;
	static int mines;
	static String[][] board;

	public static void main(String[] args) {
		getData();
		makeBoard();
		if (mines < x * x) {
			threats();
		}
	}

	public static void makeBoard() {
		board = new String[x][x];
		int mineX, mineY;
		for (int i = 0; i < mines; i++) {
			do {
				mineX = (int) (Math.random() * (x));
				mineY = (int) (Math.random() * (x));
			} while (board[mineX][mineY] == "x");
			board[mineX][mineY] = "x";
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (board[i][j] == null) {
					board[i][j] = "0";
				}
			}
		}
	}

	public static void threats() {
		int threats = 0;
		for (int i = 0; i < x; i++) {
			System.out.println("");
			for (int j = 0; j < x; j++) {
				if (!board[i][j].equals("x")) {
					for (int m = i - 1; m <= i + 1; m++) {
						for (int n = j - 1; n <= j + 1; n++) {
							if (n >= 0 && m >= 0 && m < x && n < x) {
								if (board[m][n].equals("x")) {
									threats++;
								}
							}
						}
					}
					board[i][j] = threats + "";
					threats = 0;
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
			if (i < x - 1) {
				for (int j = 0; j < 2 * x - 1; j++) {
					System.out.print("-");
				}
			}
		}
	}

	public static void getData() {
		System.out.println("Enter the height of the board:");
		x = sc.nextInt();
		do {
			System.out.println("Enter the number of mines for the board:");
			mines = sc.nextInt();
			if (mines > x * x) {
				System.out
						.println("Error: more mines than spaces on the board");
			}
			if (mines <= 0) {
				System.out.println("Error: less than 1 mine");
			}
		} while (mines > x * x || mines <= 0);
	}
}
