public class Employ{
	private String firstName;
	private String secondName;
	private double salary;
	
	public Employ(String firstName, String secondName, double salary)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.salary = salary;
	}
	//using set method
	public void setFirstName(String firstName) 
	{ 
	this.firstName = firstName;
	}  
	//using get method
	public String getFirstName() 
	{ 
	 return firstName;
	}
	
	//using set method
	public void setSecondName(String firstName) 
	{ 
	this.secondName = secondName;
	}  
	//using get method
	public String getSecondName() 
	{ 
	 return secondName;
	}
	 //using set method
	public void setSalary(double salary) 
	{ 
	this.salary = salary;
	}  
	//using get method
	public double getSalary() 
	{ 
	 return salary;
	}
	
}

	