import java.util.Scanner;

public class Even
{
	public static void main(String[] args)
	{
		System.out.print("Please Enter an Integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		if(number % 2 == 0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is odd");
		
		//myEven(6);
			// System.out.println((myEven(number)) ? "The number is Even" : "The number is odd");
	}
	
	// public static boolean myEven(int number)
	// {
		
		// if(number % 2 == 0)
			// return true;
		// else
			
		// return false;
	// }
	
	
}