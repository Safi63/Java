import java.util.Scanner;
public class BinaryFromDecimal{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Decimal Numbre:");
		int decimal = input.nextInt();
		int t = 2;
		int Remainder = 0;
		String A = " ";
		while(decimal>0){ 
		Remainder = decimal%t;
		decimal /= t;
		A = Remainder+A;
		}
	System.out.print(A);
	}
}