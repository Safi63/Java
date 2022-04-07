//Fig. 14.7: StringConcatenation.java
//String method concat.

public class StringConcatenation
{
	public static void main(String[]args)
	{
		String s1 = "Happy ";
		String s2 = "Birthday";01
		TempClass string = new TempClass(" to you");
		String s3 = string.toString();
		
		System.out.printf("s1 = %s%ns2 = %s%n%n",s1, s2);
		System.out.printf("Result of s1.concat(s2) = %s%n", s1.concat(s2));
		// System.out.printf("s1 after concatenation = %s%n",s1);
		// System.out.println(s3);
		System.out.printf("%s",((s1.concat(s2)).concat(s3)));//concatenation all of three strings

		
	}
}