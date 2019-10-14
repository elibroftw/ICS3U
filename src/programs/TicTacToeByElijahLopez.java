package programs;

import java.util.Scanner;

/**
 * Tic Toe Game Impossible Game Mode
 * 
 * @author Elijah Lopez
 */
public class TicTacToeByElijahLopez {

	static char[][] board = new char[3][3]; // This variable is for the game board
	static Scanner sc = new Scanner(System.in); // Scanner as sc for reading input
	static int danger, danger2, playermove1;
	// danger is primary place to get three in a row for the computer
	// danger2 is secondary place to get three in a row, only used for forks
	// playermove1 is the first move the player did, this is global because it
	// is used to tell computer what game the player has chosen
	static boolean win = false; // win is set false by default as computer has not won
	static char usersym, compsym;
	// usersym is the symbol user wanted to use
	// compsym is the symbol for the computer

	/**
	 * This is the main method that runs move methods
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		greeting();
		startboard();
		moveone(); // No if statement because it's impossible to win at Comp move two
		if (win == false) { // because to win at tic tac toe, a player needs at least three moves
			movetwo();
		}
		if (win == false) { // most game combinations come to this as it is a
			movethree(); // fork for most games and defense for one game
		}
		if (win == false) { // only one game combination comes to this and ends in tie game
			movefour();
		}
	}

	/**
	 * This is the method for updating the board after every move also used for grid
	 * numbering
	 * 
	 * @throws InterruptedException
	 */
	public static void printboard() throws InterruptedException {
		System.out.println(""); // newline this is for formatting
		for (int i = 0; i < 3; i++) { // loop for printing board, i is the row
			for (int j = 0; j < 3; j++) { // j is the column
				System.out.print(" "); // spacing between characters and |
				System.out.print(board[i][j]); // prints the character
				if (j < 2) { // so that there isn't a third column of |
					System.out.print(" |");
				}
			}
			System.out.println(""); // newline
			if (i < 2) { // so that there isn't a third row of -----------
				System.out.println("-----------");
			}
		}
		System.out.println(""); // newline and more formatting
		Thread.sleep(1000); // timing is not instant and makes program less aggressive
							// and acts as if computer is thinking
	}

	/**
	 * Greets user to the program and gives instructions
	 * 
	 * @throws InterruptedException
	 */
	public static void greeting() throws InterruptedException {
		System.out.println("Welcome to Tic Tac Toe by Elijah Lopez, here the computer never loses");

		System.out.println("Would you like to use x's or o's"); // prompt
		System.out.println("x for x's and o for o's");
		String temp; // this is a String because there is no sc.nextChar(), temp because it is used
						// only in this method
		do { // error checking
			temp = sc.next().toLowerCase(); // auto lowercase
			if (!temp.equals("x") && !temp.equals("o")) { // Figures if user's input was valid
				System.out.println("Type x or o!");
			}
		} while (!temp.equals("x") && !temp.equals("o")); // end of error checking
		if (temp.equals("x")) { // defines usersym and compsym if user chose x
			usersym = 'x';
			compsym = 'o';
		} else { // defines usersym and compsym if user chose o
			usersym = 'o';
			compsym = 'x';
		}

	}

	/**
	 * Prints out tutorial board for user to know how to play Clears Board and then
	 * Makes move 0 prints board
	 * 
	 * @throws InterruptedException
	 */
	public static void startboard() throws InterruptedException {
		System.out.println("Below is the Grid and the numbers corresponding to each cell");
		char c = 49; // 49 is '1' in ascii table
		for (int i = 0; i < 3; i++) { // this is to label each cell with numbers
			for (int j = 0; j < 3; j++) { // so that the user knows how to play
				board[i][j] = c;
				c++; // for loop seemed to messy just for this
			}
		}
		printboard(); // Gives the layout so that the user knows how to pick a location
		Thread.sleep(1000);
		for (int i = 0; i < 3; i++) { // starting board, after board with numbers is printed
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' '; // blanks
			}
		}
		board[2][0] = compsym; // starting position move 0
		printboard(); // prints the board after computer move 0
	}

	/**
	 * Places compsym at location y on the board This method is called every time
	 * the computer makes a move
	 * 
	 * @param y
	 */
	public static void place(int y) throws InterruptedException {
		int i = (y - 1) / 3; // calcuates row
		int j = (y - 1) % 3; // calculates column
		board[i][j] = compsym; // place compsym
		printboard(); // Updates board after every placement
	}

	/**
	 * User chooses where to play Error checked if move is valid Places usersym on
	 * chosen cell
	 * 
	 * @return player move
	 * @throws InterruptedException
	 */
	public static int playermove() throws InterruptedException {
		int move, i, j; // this is for location, board[i][j]
		System.out.println("What's your move? (1 - 9)"); // prompt user
		do { // error checking
			move = sc.nextInt(); // take in move
			i = (move - 1) / 3; // calculate row
			j = (move - 1) % 3; // calculate column
			if (move > 9 || move < 1 || board[i][j] != ' ') { // Figuers if move was invalid
				System.out.println("That was not a valid move"); // TElls user if move was invalid
			}
		} while (move > 9 || move < 1 || board[i][j] != ' '); // end of error checking
		board[i][j] = usersym; // sets cell as usersym
		printboard(); // prints board after move has been made
		System.out.println("Above is your move"); // tells user that their move has been made
		Thread.sleep(1000); // timing
		return move; // returns the validated move the player chose
	}

	/**
	 * This is move 1 This dictates the whole game
	 * 
	 * @throws InterruptedException
	 */
	public static void moveone() throws InterruptedException {
		playermove1 = playermove(); // defines the global variable
		int move; // this is computer's next move
		switch (playermove1) { // Decides what move the computer should do
		case 1:
			move = 8;
			danger = 9;
			break; // if user picked Top Left
		case 2:
			move = 9;
			danger = 8;
			break; // if user picked Top Middle
		case 3:
			move = 9;
			danger = 8;
			break; // if user picked Top Right
		case 4:
			move = 5;
			danger = 3;
			break; // if user picked Centre Left
		case 5:
			move = 8;
			danger = 9;
			break; // if user picked Centre Middle
		case 6:
			move = 5;
			danger = 3;
			break; // if user picked Centre Right
		case 8:
			move = 5;
			danger = 3;
			break; // if user picked Bottom Middle, Bottom Left was computer's first move
		case 9:
			move = 4;
			danger = 1;
			break; // if user picked Bottom Right
		default:
			move = 0;
			danger = 0;
			System.out.println("Something went wrong"); // debugging purposes
		}
		place(move); // now that the computer's move has been decided, it is time to place it and
						// print board
	}

	/**
	 * This is move 2 7/8 cases are forks 1/8 is pressure because User may be able
	 * to tie the computer
	 * 
	 * @throws InterruptedException
	 */
	private static void movetwo() throws InterruptedException {
		int playermove2 = playermove(); // player's second move is not that important so it's not global
		int move2; // computer move 2
		if (playermove2 == danger) { // if user blocks the danger from move 1
			switch (playermove1) { // 7/8 moves the player can made are winning matches therefore game can be
									// predefined
			case 1:
				move2 = 5;
				danger = 2;
				danger2 = 3;
				break; // 1
			case 2:
				move2 = 5;
				danger = 1;
				danger2 = 3;
				break; // 2
			case 3:
				move2 = 1;
				danger = 4;
				danger2 = 5;
				break; // 3
			case 4:
				move2 = 8;
				danger = 2;
				danger2 = 9;
				break; // 4
			case 5:
				move2 = 1;
				danger = 4;
				break; // Only way to tie the computer
			case 6:
				move2 = 9;
				danger = 1;
				danger2 = 8;
				break; // 5
			case 8:
				move2 = 4;
				danger = 1;
				danger2 = 6;
				break; // 6
			case 9:
				move2 = 5;
				danger = 3;
				danger2 = 6;
				break; // 7 there 7 moves end in a fork for the player
			default:
				move2 = 0;
				danger = 0;
				System.out.println("Something went wrong");
			}
			place(move2); // places the decided move 2 and prints board
		} else { // if the player wanted to see if the computer is bugged then they would lose as
					// computer checks if
			place(danger); // the danger location was blocked or not
			win = true; // won the game, computer got three in a row
			endgame(); // start end game
		}
	}

	/**
	 * This is the endgame Player could have won or lost
	 */
	public static void endgame() {
		if (win == true) { // if computer won
			System.out.println("You Lost, The Computer reigns");
		} else { // if User tied the computer, win is not possible
			System.out.println("You and the Computer Tied!");
		}
		System.out.println("Thanks for playing!");
	}

	/**
	 * For 7/8 of the player's first move, this is the last winning move for the
	 * computer
	 * 
	 * @throws InterruptedException
	 */
	public static void movethree() throws InterruptedException {
		int playermove3 = playermove(); // defines player's move
		if (playermove1 != 5) { // only way to tie is if player chose 5 as their first move
			if (playermove3 == danger) { // if player blocked danger one
				place(danger2); // danger2 would be placed and board would be prinnted
			} else { // if danger2 was blocked or if no danger was blocked
				place(danger); // danger would be placed and board would be printed
			}
			win = true; // computer wins the game
			endgame(); // Good game Player
		} else { // if User chose 5 as their first move
			if (playermove3 == danger) {
				place(6); // blocks Player from winning on their next turn
			} else { // if the player wanted to test if the program was buggeed
				place(danger); // place on danger and win
				win = true; // computer wins
				endgame(); // good game
			}
		}
	}

	/**
	 * This move is if the first user move was 5 because that is the one case where
	 * computer does not 100% win Ends in tie
	 * 
	 * @throws InterruptedException
	 */
	private static void movefour() throws InterruptedException {
		int playermove4 = playermove(); // get player move
		if (playermove4 == 2) { // only two options here and they both end in tie
			place(3); // places comp move at 3
		} else {
			place(2); // places comp move at 2
		}
		endgame();
	}
}