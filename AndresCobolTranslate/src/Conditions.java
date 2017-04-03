import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {

		char Char;

		Scanner UserInput = new Scanner(System.in);

		System.out.println("Enter lower case character or digit. No data ends.");
		Char = UserInput.next().charAt(0);

		while (Character.isDigit(Char) || Character.isAlphabetic(Char)) {

			if ("aeiou".indexOf(Char) == 0) {
				System.out.println("The letter " + Char + " is a vowel.");
			}

			else if ("bcdfghjklmnpqrstvwxyz".indexOf(Char) == 0) {
				System.out.println("The letter " + Char + " is a consonant.");
			}

			else if (Character.isDigit(Char)) {
				System.out.println(Char + " is a digit.");
			}

			else
				System.out.println("problems found");

		}
	}
}
