package programs;

import java.util.Scanner;

public class MathDrills {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you think you have what it takes to pass the math drill?");
		System.out.println("Well, let's do it anyway.");
		System.out.println("Here are your options:");
		System.out.println("1 for addition");
		System.out.println("2 for multiplication");
		int input = 0;// input is user input that is used to determine what function to use
		String func = " + ";
		do {
			input = sc.nextInt();
			if (input != 1 && input != 2) {
				System.out.println("That was an invalid option please try again");
				System.out.println("1 for addition");
				System.out.println("2 for multiplication");
			}
		} while (input != 1 && input != 2);
		if (input == 1) {
			func = " + ";
		}
		if (input == 2) {
			func = " x ";
		}
		System.out.print("Enter the smallest number to use: ");
		int min = sc.nextInt();
		System.out.print("Enter the biggest number to use: ");
		int max = sc.nextInt();
		System.out.print("Enter how many questions you would like to try: ");
		int counter = sc.nextInt(); // counter means 'how many more times to go through'
		int avg = 7000 * counter; // 7 seconds per question on average (7000 milliseconds)
		int question = 1; // used for numbering questions in loop
		int num1, num2, guess, ans; // ans is calculated and guess is the answer that was entered
		String prompt; // for question prompting and restating when guess!=ans
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1");
		Thread.sleep(1000);
		System.out.println("Good luck!");
		Thread.sleep(700);
		double start = System.currentTimeMillis();
		while (counter > 0) {// goes down to 0
			num1 = (int) (Math.random() * (max - min + 1) + min);
			num2 = (int) (Math.random() * (max - min + 1) + min);
			prompt = "Question #" + question + ": " + num1 + func + num2;
			System.out.println(prompt);
			if (func.equals(" + ")) {
				ans = num1 + num2;
			} else {
				ans = num1 * num2;
			}
			do {
				System.out.print("Your answer: ");
				guess = sc.nextInt();
				if (guess != ans) {
					System.out.println("Please try again");
					System.out.println(prompt);
				} else {
					System.out.println("Correct!");
				}
			} while (guess != ans);
			question++;// question number increase
			counter--;// counter goes down
		}
		double time = System.currentTimeMillis() - start;
		if (avg > time) {
			System.out.println("Great job! You have passed the drill!");
		} else {
			System.out.println("You failed the drill!");
			System.out.println("You took longer than an average of 7 seconds per question");
		}
		System.out.println("You took " + (Math.round(time / (question - 1)) / 1000.0) + " seconds on average!");
		sc.close();
	}
}
