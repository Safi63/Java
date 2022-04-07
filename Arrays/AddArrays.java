import java.util.Arrays;
import java.security.SecureRandom;
public class AddArrays
{
	public static void main(String[]args)
	{
		int[] array1 = new int [5];
		int[] array2 = new int [5];
		int[] sumOfArrays = new int [5];
	
		SecureRandom randomNumbers = new SecureRandom();
		
		System.out.printf("%n%s%10s%n","Array1","Array2");
		
		for(int counter = 0 ; counter<array1.length; ++counter)
		{
			
		array1[counter] = 1 + randomNumbers.nextInt(50);
		array2[counter] = 51 + randomNumbers.nextInt(50);
		sumOfArrays[counter] = array1[counter] + array2[counter];
		
		System.out.printf("%5d%10d%n",array1[counter],array2[counter]);
		}//loop  end
		
		System.out.printf("%nSum of Arrays%n");
		for(int counter = 0 ; counter<array1.length; ++counter)
		{
		System.out.printf("%8d%n",sumOfArrays[counter]);
		}
	}
}