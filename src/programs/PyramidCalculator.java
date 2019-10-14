package programs;

import java.util.Scanner;

public class PyramidCalculator {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the side length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the height: ");
        double h = sc.nextDouble();
        double sh = Math.sqrt(h*h+l*l/4);
        System.out.println("Volume of the sqaure based pyramid equals: "+(l*l*h/3));
        System.out.println("Surface area of the square based pyramid equals: "+(sh*l*2+l*l));
        sc.close();
    }
}
