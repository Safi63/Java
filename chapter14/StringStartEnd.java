// Fig. 14.4: StringStartEnd.java
// String methods startsWith and endsWith.

public class StringStartEnd 
{
	public static void main(String[] args)
	{
		String[] strings = {"baba", "bablu", "dablu", "banded"};

		// test method startsWith
		for (String string : strings)
		{
			if(string.startsWith("b"))
		System.out.printf("\"%s\" starts with \"b\"%n", string);	
		} 
		System.out.println();

		// test method startsWith starting from position 2 of string
		for (String string : strings)
		{
			if(string.startsWith("ab",2)) 
		System.out.printf("\"%s\" starts with \"ab\" at position 2%n", string);
		} 
		System.out.println();
		
		// test method endsWith
		for (String string : strings)
		{
			if(string.endsWith("ed"))
		System.out.printf("\"%s\" ends with \"ed\"%n", string);
		} 
	} 
} // end class StringStartEnd