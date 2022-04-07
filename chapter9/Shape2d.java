//  Shape2d.java

public abstract class Shape2d
{
	public  int area;
	public  int peremeter;
	
	// constructor
	public Shape2d(int area, int peremeter)
	{
		this.area = area;
		this.peremeter = peremeter;
	} 
	
	public int getArea()
	{
		return area;
	} 
	
	public int getPeremeter()
	{
		return peremeter;
	} 
	
	public abstract double area(); 
	public abstract double peremeter();
}  // end abstract class Shape2d