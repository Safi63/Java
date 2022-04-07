import java.security.SecureRandom;
import java.util.Scanner;
public class Assignment3
{
	public static void main(String[] args)
	{
		// SecureRandom randomNumbers = new SecureRandom();
		// int number1 = 1 + randomNumbers.nextInt(16);
		// int number2 = 1 + randomNumbers.nextInt(56);
		
		// System.out.printf("first number is: %d %n second number is: %d%n",number1, number2);	
		// System.out.println((isMultiple(number1,number2)) ? "second number is a multiple of first number" : "second number is not a multiple of first number");
		 
			//by prompting user
			System.out.print("Please Enter first Integer: ");
			Scanner input = new Scanner(System.in);
			int number1 = input.nextInt();
			System.out.print("Please Enter second Integer: ");
			int number2 = input.nextInt();
		
		if(number2 % number1 == 0)
			System.out.println("Second number is a multiple of first number");
		else
			System.out.println("Second number is not a multiple of first number");
	}
	
	// public static boolean isMultiple(int number1, int number2)
	// {
		
		// if(number2 % number1 == 0)
			// return true;
		// else
			// return false;
	// }
	
	
}