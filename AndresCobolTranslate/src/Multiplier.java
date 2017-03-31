import java.util.Scanner;

public class Multiplier {

	public static void main(String[] args) {

		int Num1;
		int Num2;
		Multiplier multiplier = new Multiplier();
		
		Scanner UserInput = new Scanner(System.in);

		System.out.println("Enter first number  (1 digit) : ");
		Num1 = UserInput.nextInt();

		System.out.println("Enter second number (1 digit) : ");
		Num2 = UserInput.nextInt();
		
		System.out.println("Result is = " + multiplier.multiply(Num1, Num2));

	}
	
	public int multiply (int number1, int number2){
		
		return number1 * number2;
		
	}
	

}
