package programs;

public class Scrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("here");
		int hi;
		do {
			hi = (int) (Math.random() * (7 - 2) + 3);

		} while (hi < 3 || hi > 3);
		System.out.println(hi);
	}

}
