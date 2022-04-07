import java.util.Scanner;
public class Assignment2
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
	}
	
}