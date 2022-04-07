import java.util.*;
public class Employee
{
	private final String name;
	private final int ID;
	private final double salary;
	
	// constructor
	public Employee(String name,int ID,double salary)
	{
	this.name = name;
	this.ID = ID;
	this.salary = salary;
	} 
	
	// return first name
	public String getName()
	{
	return name;
	}  
	
	public int getID()
	{
		return ID;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	@Override
	public int compareTo(Employee e)
	{
		if(this.ID == e.getID())
			return 0;
		if(this.ID < e.getID())
			return -1;
		else
			return 1;
	}
	
	// return String representation of Employee object
	@Override
	public String toString()
	{
	return String.format("Name: %s %nEmployee ID: %s%nEmployee Salray: %s", 
	getName(),getID(),getSalary());
	}
	
}   