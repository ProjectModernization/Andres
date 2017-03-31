import java.util.Scanner;

public class IterIf {

	public static void main(String[] args) {
		int Num1, Num2, Result = 0;
		char Operator;
		

		Scanner UserInput = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter First Number      : ");
			Num1 = UserInput.nextInt();

			System.out.println("Enter Second Number     : ");
			Num2 = UserInput.nextInt();

			System.out.println("Enter operator (+ or *) : ");
			Operator = UserInput.next().charAt(0);

			if (Operator == '+')
				Result = IterIf.sum(Num1, Num2);

			if (Operator == '*')
				Result = IterIf.multiply(Num1, Num2);

			System.out.println("Result is = " + Result);

		}

	}
	
	static int multiply(int num1, int num2) {
		return num1 * num2;
		
	}

	static int sum (int num1,int num2){
		return num1 + num2;
	}
	}

