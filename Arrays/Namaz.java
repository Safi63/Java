//fig. 7.18: Gradebook.java
public class Namaz
{
	private String name;
	private int [][] namaz;
	
	public Namaz(String name, int [][]namaz)
	{
		this.name = name;
		this.namaz = namaz;
	}
	
	public void setNamazName(String name)
	{
		this.name = name;
	}
	
	public String getNamazName()
	{
		return name;
	}
	
	public void processGrades()
	{
		//output grades array
		outputGrades();
		
	}
	
	
	
	// determine average grade for particular set grades
	public double getAverage(int[] setOfNamaz)
	{
		int total = 0;
		
		for(int grade : setOfNamaz)
			total += grade;
		
		return(double)total/setOfNamaz.length;
	}
	
	
	
	//output contents of grades array
	public void outputGrades()
	{
		System.out.printf("The Namaz table is:%n%n");
		System.out.print("		");//align to column heads
		
		//creat a column heading for each of the tests
		for(int test = 0 ; test<namaz[0].length; test++)
		{
			if( test == 0)
				System.out.printf("Fajar\t");
			if( test == 1)
				System.out.printf("Zuhar\t");
			if( test == 2)
				System.out.printf("Aasr\t");
			if( test == 3)
				System.out.printf("Maghrib\t ");
			if( test == 4)
				System.out.printf("Isha\t");
		}
			System.out.println("Average");
			
			for(int person =0; person<namaz.length; person++)
			{
			System.out.printf("Person %2d", person +1);
				
			for(int test : namaz[person])
				System.out.printf("%9d", test);
			
			//call method getAverage to calculate student's average grades;
			//pass row of grades as the argument to getAverage
			double average = getAverage(namaz[person]);
			System.out.printf("%9.2f%n",average);
		}
	}
}//end class gradeBook