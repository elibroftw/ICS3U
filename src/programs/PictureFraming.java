package programs;

import java.util.Scanner;

public class PictureFraming {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How tall is the painting?");
		int height = sc.nextInt();
		System.out.println("How wide is the painting?");
		int width = sc.nextInt();
		System.out.println("How wide do you want the mat to be?");
		int mat = sc.nextInt();
		System.out.println("How wide do you want the picture frame to be?");
		int frame = sc.nextInt();

		int wide = 2 * frame + 2 * mat + width;

		for (int i = 0; i < frame; i++) {
			for (int j = 0; j < wide; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		for (int i = 0; i < mat; i++) {
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < 2 * mat + width; j++) {
				System.out.print("+");
			}
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < mat; j++) {
				System.out.print("+");
			}
			for (int j = 0; j < width; j++) {
				System.out.print("$");
			}
			for (int j = 0; j < mat; j++) {
				System.out.print("+");
			}
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}

			System.out.println("");
		}
		for (int i = 0; i < mat; i++) {
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}
			for (int j = 0; j < 2 * mat + width; j++) {
				System.out.print("+");
			}
			for (int j = 0; j < frame; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		for (int i = 0; i < frame; i++) {
			for (int j = 0; j < wide; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		sc.close();

	}

}
