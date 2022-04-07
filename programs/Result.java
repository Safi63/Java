public class Result
{
	private int numbers;
	private String subName;
	
	
	//constructor
	public Result(int numbers, String subName)
	{
		this.numbers = numbers;
			
		this.subName = subName;	
	}
	
	// setters
	public void setNumbers(int numbers)
	{ 
		this.numbers = numbers;
	}
	
	public void  setSubName(String subName)
	{
		this.subName = subName;
	}
	
	// getters
	public int getNumbers()
	{
		return numbers;
	}
	
	public String getSubName()
	{
		return subName;
	}
	
	public String getStatus()
	{
		String status = "";
		if(numbers>=60)
			status = "P";
		else 
			status = "F";
		return status;
	}
}