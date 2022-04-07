//fig.7.17: InitArray.java
// Initializing two dimensional arrays.
public class InitArray
{
	//creat and output two-dimensional arrays
	public static void main(String[]args)
	{
		int[][] array1 = {{1,2,3},{4,5,6}};
		int [][] array2 = {{1,2},{3},{4,5,6}};
		
		System.out.println("Values in array1 by row are:");
		outputArray(array1);//displays array1 by row
		
		System.out.printf("%nValues in array2 by row are%n");
		outputArray(array2);//displays array2 by row
	}//end main method
	
	public static void outputArray(int[][] array)
	{
	//loop through arrays rows 
	for(int row = 0 ; row<array.length; row++)
	{
		//loop through colums of current row 
		for(int column = 0; column < array[row].length; column++)
			System.out.printf("%d  ",array[row][column]);
		
		System.out.println();
	}
	}
}//end class InitArray