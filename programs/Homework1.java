import java.util.Scanner;
/*public class Homework1
{
	public static void main(String[]args)
	{
	System.out.println("Welcome to Isdp programming");
	Scanner input = new Scanner(System.in);
	
	int numbers;
	
	System.out.print("Enter Numbers: ");//prompt
	numbers = input.nextInt();
	System.out.printf("%d%s",numbers/10000,"  ");
	numbers=numbers%10000;
	System.out.printf("%d%s",numbers/1000,"  ");
	numbers=numbers%1000;
	System.out.printf("%d%s",numbers/100,"  ");
	numbers=numbers%100;
	System.out.printf("%d%s",numbers/10,"  ");
	numbers=numbers%10;
	System.out.printf("%d",numbers);
	}
}*/



public class Homework1
{
	public static void main(String[]args)
	{
	System.out.println("Welcome to Isdp programming");
	Scanner input = new Scanner(System.in);
	Scanner put = new Scanner(System.in);
	int numbers;
	int mod;
	System.out.print("Enter Numbers: ");
	numbers = input.nextInt();
	mod = put.nextInt();
	System.out.printf("%d%s",numbers/mod,"  ");
	numbers=numbers%mod;
	mod = put.nextInt();
	System.out.printf("%d%s",numbers/mod,"  ");
	numbers=numbers%mod;
	mod = put.nextInt();
	System.out.printf("%d%s",numbers/mod,"  ");
	numbers=numbers%mod;
	mod = put.nextInt();
	System.out.printf("%d%s",numbers/mod,"  ");
	numbers=numbers%mod;
	System.out.printf("%d",numbers);
	}
}