//fig. 7.19: GradeBookTest.java
public class NamazTest
{
	//main method begins program execution
	public static void main(String[]args)
	{
		int[][] namazArray = {{2,4,4,3,4}
		,{2,4,0,3,4},{0,4,4,3,4},{2,0,4,0,4},{0,0,0,3,4},{2,4,0,3,0},{2,4,4,0,4},{2,0,4,3,0},{2,4,4,3,0},{2,4,4,3,0}};
		
		Namaz myNamaz = new Namaz("Namaz Chart", namazArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",myNamaz.getNamazName());
		myNamaz.processGrades();
		
	}
}