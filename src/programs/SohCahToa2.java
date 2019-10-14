package programs;

public class SohCahToa2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		double A = 4;
		double B = 3;
		double a = Math.toDegrees(Math.atan(A / B));
		double b = 90 - a;
		System.out.println(a);
		System.out.println(b);

	}

}
