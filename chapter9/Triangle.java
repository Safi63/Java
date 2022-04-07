//  Triangle.java

public class Triangle extends Shape2d
{
	private int base;
	private int height;
	private int length;
	
	// constructor
	public Triangle(int area, int peremeter, int base, int height, int length)
	{
	super(area, peremeter);
	this.base = base;
	this.height = height;
	this.length = length;
	} 

	public void setbase(int base)
	{
		this.base = base;
	} 

	public int getbase()
	{
	return base;
	} 
	
	public void setHeight(int height)
	{
		this.height = height;
	} 

	public int getHeight()
	{
	return height;
	}
	
	public void setLength(int length)
	{
		this.length = length;
	} 

	public int getLength()
	{
	return length;
	}
	
	@Override 
	public double area()
	{	
	return (base * height) / 2;
	}
	
	public double peremeter()
	{
	return (base + height + length);
	}
}   // end class Triangle