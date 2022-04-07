public class Data{
	private int day;
	private int month;
	private int year;
	
	public Data(int day, int month, int year){
		 this.day = day;
		 this.month = month;
		 this.year = year;
		 }
	//using set method
	public void setDay(int day) 
	{ 
	this.day = day;
	}  
	//using get method
	public int getDay() 
	{ 
	 return day;
	}
	
	//using set method
	public void setMonth(int month) 
	{ 
	this.month = month;
	}  
	//using get method
	public int getMonth() 
	{ 
	return month;
	}
	 //using set method
	public void setYear(int year) 
	{ 
	this.year = year;
	}  
	//using get method
	public int getYear() 
	{ 
	return year;
	}
}