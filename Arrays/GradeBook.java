//fig. 7.18: Gradebook.java
public class GradeBook
{
	private String couresName;
	private int [][] grades;
	
	public GradeBook(String couresName, int [][]grades)
	{
		this.couresName = couresName;
		this.grades = grades;
	}
	
	public void setCourseName(String couresName)
	{
		this.couresName = couresName;
	}
	
	public String getCourseName()
	{
		return couresName;
	}
	
	public void processGrades()
	{
		//output grades array
		outputGrades();
		
		//call metods getMinimum and getMaximum
		System.out.printf("%n%s %d%n%s %d%s%n",
		"Lowest grade in the grade book is:", getMinimum(),
		"Highest grade in the grade book is:", getMaximum());
		
		//output grade distribution chart of all grades on all tests 
		outputBarChar();
	}
	//find minimum
	public int getMinimum()
	{
		int lowGrade = grades[0][0];
		for(int[] studentGrades : grades)
		{
			for(int grade : studentGrades)
			{
				if(grade < lowGrade)
					lowGrade = grade;
			}
		}
		return lowGrade;
	}
	//find maximum grades
	public int getMaximum()
	{
		int highGrade = grades[0][0];
		
		for(int[] studentGrades : grades)
		{
			for (int grade : studentGrades)
			{
				if(grade > highGrade)
					highGrade = grade;
			}
		}
		return highGrade;
	}
	
	// determine average grade for particular set grades
	public double getAverage(int[] setOfGrades)
	{
		int total = 0;
		
		for(int grade : setOfGrades)
			total += grade;
		
		return(double)total/setOfGrades.length;
	}
	
	//output barChart displaying
	public void outputBarChar()
	{
		System.out.println("Overall grade distribution:");
		
		int[] frequency = new int[11];
		
		for(int[] studentGrades: grades)
		{
			for(int grade: studentGrades)
				++frequency[grade/10];
		}
		
		for(int count = 0; count<frequency.length; count++)
		{
			if(count == 10)
				System.out.printf("%5d: ",100);
			else
				System.out.printf("%02d-%02d: ",count*10, count*10+9);
			
			for(int stars = 0; stars<frequency[count]; stars++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	//output contents of grades array
	public void outputGrades()
	{
		System.out.printf("The grades are:%n%n");
		System.out.print("		");//align to column heads
		
		//creat a column heading for each of the tests
		for(int test = 0 ; test<grades[0].length; test++)
		System.out.printf("Test%d\t", test+1);
			
			System.out.println("Average");
			
			for(int student =0; student<grades.length; student++)
			{
			System.out.printf("Student %2d", student +1);
				
			for(int test : grades[student])
				System.out.printf("%9d", test);
			
			//call method getAverage to calculate student's average grades;
			//pass row of grades as the argument to getAverage
			double average = getAverage(grades[student]);
			System.out.printf("%9.2f%n",average);
		}
	}
}//end class gradeBook