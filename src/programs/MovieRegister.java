package programs;

import java.util.Scanner;

public class MovieRegister {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Lopez Theater. How old are you?");
		int age = sc.nextInt();
		double total;
		if ((age<=12) || (age>=65)){total = 8.0;}
		else {total = 12;}
		System.out.println("Would you like to upgrade your ticket to AVX or IMAX?");
		System.out.println("Enter 1 for AVX, 2 for IMAX, or 3 for no upgrade");
		int upgrade = sc.nextInt();
		if (upgrade == 1){total=total*1.25;}
		else if (upgrade == 2){total=total*1.35;}
		else{}
		System.out.println("Excellent choice! We also offer DBOX seating for an additional $5.00.");
		System.out.println("Would you like to  upgrade even further for the ultimate experience? Yes or No?");
		String DBOX = sc.next();
		if (DBOX.equals("Yes")){total=total+5;}
		else{}
		System.out.println("Are there any snacks you would like?");
		System.out.println("1. 355mL Pop: $1.00");
		System.out.println("2. 500mL Pop: $2.00");
		System.out.println("3. Small Popcorn: $4.00");
		System.out.println("4. Large Popcorn: $6.00");
		System.out.println("5. Large Popcorn and 355mL of pop: $6.75");
		System.out.println("6. Large Popcorn and 500mL of pop: $7.50");
		System.out.println("7. Small Popcorn and 355mL of pop: $5.00");
		System.out.println("8. Hershey's chocolate bar: $3.00");
		System.out.println("Enter your choice, Enter any other number for no snacks");
		int choice = sc.nextInt();
		switch(choice){
		case 1: total=total+1; break;
		case 2: total=total+2; break;
		case 3: total=total+4; break;
		case 4: total=total+6; break;
		case 5: total=total+6.75; break;
		case 6: total=total+7.5; break;
		case 7: total=total+5; break;
		case 8: total=total+3; break;
		default: System.out.println("No snacks? That's all right");}
		total = total*1.13;
		total = Math.round(total*100.0)/100.0;
		System.out.println("Your total comes to $"+total);
		System.out.println("How much cash are you paying with?");
		double cash = sc.nextDouble();
		double change = Math.round((cash - total)*100.0)/100.0;
		System.out.println("Your change is $"+change);
		change = change*100;
		int hundred = (int) (change/10000);
		int fifty = (int) (change%10000/5000);
		int ten = (int) (change%100000%5000/1000);
		int five = (int) (change%100000%5000%1000/500);
		int toonie = (int) (change%100000%5000%1000%500/200);
		int loonie = (int) (change%100000%5000%1000%500%200/100);
		change = (int) (change%100000%5000%1000%500%200%100);
		int quarters = (int) (change/25);
		int dimes = (int) (change%25/10);
		int nickels = (int) (change%25%10/5);
		int pennies = (int) (change%25%10%5);
		String statement = "Your change: ";
		if (change > 0) {
			if (hundred > 0) {
				statement = statement + hundred + " $100 bill";
				if (hundred > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (fifty > 0) {
				statement = statement + fifty + " $50 bill";
				if (fifty > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (ten > 0) {
				statement = statement + ten + " $10 bill";
				if (ten > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (five > 0) {
				statement = statement + five + " $5 bill";
				if (five > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (toonie > 0) {
				statement = statement + toonie + " toonie";
				if (toonie > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (loonie > 0) {
				statement = statement + loonie + " loonie";
				if (loonie > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (quarters > 0) {
				statement = statement + quarters + " quarter";
				if (quarters > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (dimes > 0) {
				statement = statement + dimes + " dime";
				if (dimes > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (nickels > 0) {
				statement = statement + nickels + " nickel";
				if (nickels > 1) {
					statement = statement + "s";
				}
				statement = statement + ", ";
			}
			if (pennies > 0) {
				if (pennies > 1) {
					statement = statement + pennies + " pennies";
				} else {
					statement = statement + pennies + " penny";
				}
				statement = statement + ".";
			}
		}
		if ((cash - total ) > 0) System.out.println(statement);
		System.out.println("Enjoy your movie!");
		sc.close();
	}
}
