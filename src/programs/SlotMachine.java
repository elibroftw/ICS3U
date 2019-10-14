package programs;

import java.util.Scanner;

public class SlotMachine {
	/*
	 * SLOTMACHINE BY: Elijah Lopez
	 * Version: 1.0
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);//Scanner
		System.out.println("Welcome to Eli's Slot Machine, More money more bragging");
		System.out.println("What is your name?");
		String name = sc.next();
		int wins = 0;
		int losses = 0;
		int prize = 0;
		int spins = 0;
		int credit = 100;
		int totalbets = 0;
		int s1, s2, s3, bet;
		String start,quit; //declaring variables
		
		String bones = ( //decalring Symbols
				" .-.               .-.\n" +
				"(   `-._________.-'   )\n" +
				">=      _______    =<\n" +
				"(   ,-'`       `'-,   )\n" +
		" `-'               `-'\n");
		String keys = (
				"  __________\n" +
				"//'      \\\\\\\\\n" +
				"|  ,^^^,    \\\\\\\\\\\\     ,////,     ,///,  ,//,\n" +
				"|  |' '|        \"-------\"\"\"\"------\"\"\"\"----\"\"-\\\n" +
				"|  |   |           \"\"\"\"      \"\"\"\"      \"\"    ->\n" +
				"|  |, ,|      ,''''''''''''''''''''''''''''''/\n" +
				"|  `\"\"\"'     //\"\n" +
		"\\___________/\n");
		String diamonds = (
				"      __________________\n" +
				"    .-'  \\ _.-''-._ /  '-.\n" +
				"  .-/\\   .'.      .'.   /\\-.\n" +
				" _'/  \\.'   '.  .'   './  \\'_\n" +
				":======:======::======:======:\n" +
				"   '. '.  \\     ''     /  .' .'\n" +
				"   '. .  \\   :  :   /  . .'\n" +
				"     '.'  \\  '  '  /  '.'\n" +
				"       ':  \\:    :/  :'\n" +
				"         '. \\    / .'\n" +
				"           '.\\  /.'    \n" +
		"             '\\/'\n");
		String dices =
			("    _______\n" +
					"  /\\       \\\n" +
					" /()\\   ()  \\\n" +
					"/    \\_______\\\n" +
					"\\    /()     /\n" +
					" \\()/   ()  /\n" +
			"  \\/_____()/\n"); //defining 4 symbols
		System.out.println(diamonds+"\n"+keys+"\n"+dices+"\n"+bones+"\n"); //Showing symbols
		System.out.println("Ready to begin "+name+"?");
		System.out.println("Above are the 4 different symbols");
		System.out.println("From bottom to top: bone, dice, key, diamond");
		System.out.println("Here are the rules:");
		System.out.println("You win if there are three matching symbols");
		System.out.println("3 Diamonds gives you 100x your bet");
		System.out.println("3 Keys gives you 20x your bet");
		System.out.println("3 Dices gives you 5x your bet");
		System.out.println("3 Bones gives you 2x your bet");
		System.out.println("You start off with 100 coins"); // Theses are the guidelines
		System.out.println("Good Luck");
		while(credit > 0){ //Main game
			do{ // asking for bet
				System.out.println("Enter how many coins you would like to bet:");
				bet = sc.nextInt();
				if (bet < 1 || bet > credit || bet > 10){
					System.out.println("That bet is not valid");
					System.out.println("Your Bet must be: ");
					System.out.println("	more than 0"); //restating guidelines
					System.out.println("	less than 10");
					System.out.println("	less than total coins");
				}
			}while(bet < 1 || bet >10 || bet > credit);
			do{System.out.println("Enter yes to spin! Enter no to change your bet!");
			start = sc.next(); //Confirmation for their bet
			if (start.equalsIgnoreCase("no")){
				do{
					System.out.println("Enter how many coins you would like to bet:");
					bet = sc.nextInt();
					if (bet < 1 || bet > credit || bet > 10){
						System.out.println("That bet is not valid");
						System.out.println("Your Bet must be: ");
						System.out.println("	more than 0"); //restating guidelines
						System.out.println("	less than 10");
						System.out.println("	less than total coins");
					}
				}while(bet < 1 || bet > 10 || bet > credit);
			}
			}while (start.equalsIgnoreCase("yes") == false); //in case they messed up their bet twice
			spins ++; //tracking spins
			credit -= bet; //updating coins
			totalbets += bet; //updating totalbet
			s1 = (int) (Math.random() * 4 + 1); // Random number generator for symbols
			s2 = (int) (Math.random() * 4 + 1);
			s3 = (int) (Math.random() * 4 + 1);

			switch(s1){//3 switch statements to print out the correct symbols
			case 1: System.out.println(bones); break;
			case 2: System.out.println(dices); break;
			case 3: System.out.println(keys); break;
			case 4: System.out.println(diamonds); break;
			}
			switch(s2){
			case 1: System.out.println(bones); break;
			case 2: System.out.println(dices); break;
			case 3: System.out.println(keys); break;
			case 4: System.out.println(diamonds); break;
			}
			switch(s3){
			case 1: System.out.println(bones); break;
			case 2: System.out.println(dices); break;
			case 3: System.out.println(keys); break;
			case 4: System.out.println(diamonds); break;
			}

			if (s1 == s2 && s2 == s3){ //determining win or loss;
				switch(s1){
				case 1: bet *= 2; break; //different multipliers for different symbols
				case 2: bet *= 5; break;
				case 3: bet *= 20; break;
				case 4: bet *= 100; break;
				}
				System.out.println("Woohoo You won "+bet); //winning message
				credit += bet;
				wins ++;
				prize += bet;
			}
			else{ //losing message
				System.out.println("You lost: "+bet+" coins");
				losses ++;
			}
			System.out.println("Current balance: "+credit+" coins");
			if (credit > 0){
				System.out.println("Would you like to play again (Yes/No)");
				System.out.println("Not entering No means Yes");
				quit = sc.next();
				if (quit.equalsIgnoreCase("no")){ //to quit game
					break;
			}
			}
		}//end of game
		System.out.println("You have walked away with "+credit+" coins");
		if (credit>100){ // different messages for different cash outs
			System.out.println("Well done "+name+". You have left with more money than you come in with.");
		}
		else if(credit == 0){
			System.out.println(name+", come again any time! You may fair better next time.");
		}
		else{// credit> 0 and credit < 100
			System.out.println("Try your luck next time "+name+", you may walk away with more than "+credit+" coins");
			System.out.println("No promises!");
		}
		System.out.println("Times spun: "+ spins); //self explanatory, ending  messages
		System.out.println("Times won: "+ wins);
		System.out.println("Times lost: "+ losses);
		System.out.println("Total bet: "+ totalbets);
		System.out.println("Total winnings: "+ prize);
		sc.close();
	}

}
