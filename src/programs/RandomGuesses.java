package programs;

import java.util.Scanner;

public class RandomGuesses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int guess;
		System.out.print("Enter a number between 1 and 100: ");
		int number = sc.nextInt();
		int counter=0;
		do{			
			guess = (int) (Math.random()*100+1);
			counter++;
			System.out.println("Guess # "+counter+" = "+guess);
		}while(guess!=number);
		System.out.println("It took me "+counter+" tries to guess your number");
		sc.close();
	}

}
