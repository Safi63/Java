//fig. 7.19: GradeBookTest.java
public class GradeBookTest
{
	//main method begins program execution
	public static void main(String[]args)
	{
		int[][] gradesArray = {{87,96,70},
								{68,87,90},
								{87,93,71},
								{87,83,70},
								{87,72,70},
								{91,96,70},
								{87,96,71},
		{87,100,70},
		{76,96,70},
		{100,96,82}};
		
		GradeBook myGradeBook = new GradeBook("CS 101 Introduction to Java Programming", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n",myGradeBook.getCourseName());
		myGradeBook.processGrades();
		
	}
}