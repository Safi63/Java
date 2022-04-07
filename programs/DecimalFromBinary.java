import java.util.*;
import java.lang.Math;
public class DecimalFromBinary{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary number: ");
		int binary = input.nextInt();
		int t = 2;
		int Decimal = 0;
		int count = 0;
		while(binary>0){
			Decimal += binary%10*Math.pow(t,count);
			binary /= 10;
			count++;
		}
		System.out.print(Decimal);
	}
}