package programs;

import java.util.Scanner;

public class NumberConverter {
	/**
	 * This program will convert Octal, Binary, Hexadecimal, Decimal to any other
	 * number system Includes proper number format checking
	 * 
	 * @author Elijah Lopez
	 */
	static Scanner sc = new Scanner(System.in);
	static int convertFrom;
	static int convertTo;
	static String temp;

	public static void main(String[] args) {
		SelectChoice(); // This is the menu for which the user selects their choice
		boolean goodFormat; // to continue or not
		String number; // number that User inputs
		System.out.println("Enter your number: ");
		do {
			number = sc.next().toUpperCase(); // if google does it so should I
			goodFormat = ValidNumber(convertFrom, number); // Switch statement that has 4 more methods
			if (goodFormat == false) { // self explanatory
				System.out.println("THAT FORMAT IS INCORRECT!");
			}
		} while (goodFormat == false);
		Convert(number);
	}

	/**
	 * This is the menu for which the user selects their choice
	 */
	public static void SelectChoice() {

		System.out.println("Welcome to the number converter");
		System.out.println("What do you want to convert from");
		System.out.println("1 for Binary");
		System.out.println("2 for Decimal");
		System.out.println("3 for Octal");
		System.out.println("4 for Hexadecimal");
		do {
			convertFrom = sc.nextInt();
			if (convertFrom > 4 || convertFrom < 1) {
				System.out.println("Please Enter a valid choice");
			}
		} while (convertFrom > 4 || convertFrom < 1);
		System.out.println("What do you want to convert to");
		if (convertFrom != 1) {
			System.out.println("1 for Binary");
		}
		if (convertFrom != 2) {
			System.out.println("2 for Decimal");
		}
		if (convertFrom != 3) {
			System.out.println("3 for Octal");
		}
		if (convertFrom != 4) {
			System.out.println("4 for Hexadecimal");
		}
		do {
			convertTo = sc.nextInt();
			if (convertTo > 4 || convertTo < 1 || convertTo == convertFrom) { // Only 3 options not 4
				System.out.println("Please Enter a valid choice");
			}
		} while (convertTo > 4 || convertTo < 1 || convertTo == convertFrom);
	}

	/**
	 * Checks if number is valid based on the number type the User chose Main method
	 * looked cleaner without this
	 * 
	 * @param convertFrom
	 * @param number
	 * @return
	 */
	public static boolean ValidNumber(int convertFrom, String number) {
		switch (convertFrom) {
		case 1:
			return CheckBinary(number);
		case 2:
			return CheckDecimal(number);
		case 3:
			return CheckOctal(number);
		case 4:
			return CheckHex(number);
		default:
			return false;
		}
	}

	/**
	 * Checks if number is is correct binary format
	 * 
	 * @param number
	 * @return
	 */
	public static boolean CheckBinary(String number) {

		char[] toCheck = number.toCharArray();
		for (int i = 0; i < toCheck.length; i++) {
			if (toCheck[i] < (char) 48 || toCheck[i] > (char) 49) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if number is in correct Decimal Format
	 * 
	 * @param number
	 * @return
	 */
	public static boolean CheckDecimal(String number) {

		char[] toCheck = number.toCharArray();
		for (int i = 0; i < toCheck.length; i++) {
			if (toCheck[i] < 48 || toCheck[i] > 57) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if number is in correct Octal Format
	 * 
	 * @param number
	 * @return
	 */
	public static boolean CheckOctal(String number) {
		char[] toCheck = number.toCharArray();
		// char > 65 && char < 91
		for (int i = 0; i < toCheck.length; i++) {
			if (toCheck[i] < 48 || toCheck[i] > 55) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if number is in correct Hexadecimal Format
	 * 
	 * @param number
	 * @return
	 */
	public static boolean CheckHex(String number) {
		char[] toCheck = number.toCharArray();
		// char > 47 && char < 58
		for (int i = 0; i < toCheck.length; i++) {
			if (Character.isDigit(toCheck[i]) == false) {
				if (toCheck[i] < 65 || toCheck[i] > 70) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Selects which method(s) to run based on choices
	 * 
	 * @param number
	 */
	public static void Convert(String number) {
		switch (convertFrom) {
		case 1:
			switch (convertTo) {
			case 2:
				System.out.println(BiToDec(number));
				break;
			case 3:
				temp = BiToDec(number) + "";
				DecToOc(temp);
				break;
			case 4:
				temp = BiToDec(number) + "";
				DecToHex(temp);
				break;
			default:
				System.out.println("Something went wrong");
			}
			break;
		case 2:
			switch (convertTo) {
			case 1:
				DecToBi(number);
				break;
			case 3:
				DecToOc(number);
				break;
			case 4:
				DecToHex(number);
				break;
			default:
				System.out.println("Something went wrong");
			}
			break;
		case 3:
			switch (convertTo) {
			case 1:
				temp = OcToDec(number) + "";
				DecToBi(temp);
				break;
			case 2:
				System.out.println(OcToDec(number));
				break;
			case 4:
				temp = OcToDec(number) + "";
				DecToHex(temp);
				break;
			default:
				System.out.println("Something went wrong");
			}
			break;
		case 4:
			switch (convertTo) {
			case 1:
				temp = HexToDec(number) + "";
				DecToBi(temp);
				break;
			case 2:
				System.out.println(HexToDec(number));
				break;
			case 3:
				temp = HexToDec(number) + "";
				DecToOc(temp);
				break;
			default:
				System.out.println("Something went wrong");
			}
			break;
		default:
			System.out.println("Something went wrong");

		}
	}

	/**
	 * Converts from Binary to Decimal
	 * 
	 * @param number
	 * @return
	 */
	public static int BiToDec(String number) {
		int multiplier;
		int total = 0;
		String letter;
		for (int i = number.length(); i > 0; i--) {
			letter = number.substring(number.length() - i, number.length() - i + 1);
			if (letter.equals("1")) {
				multiplier = 1;
			} else { // has to be "0" because number is already checked
				multiplier = 0;
			}
			total += multiplier * Math.pow(2, i - 1);
		}
		return total; // returns total just in case if output is not supposed to be Decimal
	}

	/**
	 * Converts Hexadecimal to Decimal
	 * 
	 * @param number
	 * @return
	 */
	public static int HexToDec(String number) {
		int multiplier = 0;
		int total = 0;
		char[] chars = number.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case '0':
				multiplier = 0;
				break;
			case '1':
				multiplier = 1;
				break;
			case '2':
				multiplier = 2;
				break;
			case '3':
				multiplier = 3;
				break;
			case '4':
				multiplier = 4;
				break;
			case '5':
				multiplier = 5;
				break;
			case '6':
				multiplier = 6;
				break;
			case '7':
				multiplier = 7;
				break;
			case '8':
				multiplier = 8;
				break;
			case '9':
				multiplier = 9;
				break;
			case 'A':
				multiplier = 10;
				break;
			case 'B':
				multiplier = 11;
				break;
			case 'C':
				multiplier = 12;
				break;
			case 'D':
				multiplier = 13;
				break;
			case 'E':
				multiplier = 14;
				break;
			case 'F':
				multiplier = 15;
				break;
			default:
				System.out.println("Something went wrong");
			}
			total += multiplier * Math.pow(16, chars.length - i - 1);
		}
		return total; // returns total just in case if output is not supposed to be Decimal
	}

	/**
	 * Converts Octal to Decimal
	 * 
	 * @param number
	 * @return
	 */
	public static int OcToDec(String number) {
		int multiplier = 0;
		int total = 0;
		char[] chars = number.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			switch (chars[i]) {
			case '0':
				multiplier = 0;
				break;
			case '1':
				multiplier = 1;
				break;
			case '2':
				multiplier = 2;
				break;
			case '3':
				multiplier = 3;
				break;
			case '4':
				multiplier = 4;
				break;
			case '5':
				multiplier = 5;
				break;
			case '6':
				multiplier = 6;
				break;
			case '7':
				multiplier = 7;
				break;
			default:
				System.out.println("Something went wrong");
			}
			total += multiplier * Math.pow(8, chars.length - i - 1);
		}
		return total; // returns total just in case if output is not supposed to be Decimal
	}

	/**
	 * Converts Decimal to Binary
	 * 
	 * @param number
	 */
	public static void DecToBi(String number) {
		int temp = StringToInteger(number);
		String output = "";
		do {
			output = temp % 2 + output;
			temp = temp / 2;
		} while (temp > 0);
		System.out.println(output); // prints it out because Decimal converting is the last method
	}

	/**
	 * Converts Decimal to Octal
	 * 
	 * @param number
	 */
	public static void DecToOc(String number) {
		int temp = StringToInteger(number);
		String output = "";
		do {
			output = temp % 8 + output;
			temp = temp / 8;
		} while (temp > 0);
		System.out.println(output); // prints it out because Decimal converting is the last method
	}

	/**
	 * Converts Decimal to Hexadecimal
	 * 
	 * @param number
	 */
	public static void DecToHex(String number) {
		int temp = StringToInteger(number);
		String output = "";
		String converted;
		int convert;
		do {
			convert = temp % 16;
			switch (convert) { // Hex values if number > 9
			case 10:
				converted = "A";
				break;
			case 11:
				converted = "B";
				break;
			case 12:
				converted = "C";
				break;
			case 13:
				converted = "D";
				break;
			case 14:
				converted = "E";
				break;
			case 15:
				converted = "F";
				break;
			default:
				converted = convert + "";
				break; // less than 10
			}
			output = converted + output;
			temp = temp / 16;
		} while (temp > 0);
		System.out.println(output); // prints it out because Decimal converting is the last method
	}

	/**
	 * Converts String to Integer without using Integer.ParseInt()
	 * 
	 * @param str
	 * @return
	 */
	public static int StringToInteger(String str) {
		int integer = 0, factor = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			integer += (str.charAt(i) - '0') * factor;
			factor *= 10;
		}
		return integer; // Converts String to an Integer without using ParseInt
	}

}