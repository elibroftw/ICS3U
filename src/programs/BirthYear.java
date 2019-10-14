package programs;

public class BirthYear {

	/**
	 * @author Elijah Lopez
	 */
	public static void main(String[] args) {

		String firstName = "Elijah ";
		String lastName = "Lopez";
		int age = 16;
		final int CURRENT_YEAR = 2017;
		int BirthYear = CURRENT_YEAR - age;
		System.out.println("Hello, " + firstName + lastName + "!");
		System.out.println("You were born in " + BirthYear + "!");

	}

}
