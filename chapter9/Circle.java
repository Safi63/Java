//  Circle.java

public class Circle extends Shape2d
{
	private int radius; 
	private double  pai = 3.14; 

	// constructor
	public Circle(int area, int peremeter, int radius, double pai)
	{
	super(area, peremeter);
	this.radius = radius;
	this.pai = pai;
	} 

	public void setRadius(int radius)
	{
	this.radius = radius;
	} 

	public int getRadius()
	{
	return radius;
	} 
	
	public void setPai(double pai)
	{
	this.pai = pai;
	} 

	public double getPai()
	{
	return pai;
	}
	
	@Override 
	public double area()
	{
	return  pai*(double)(Math.pow(radius, 2));
	}
	
	public double peremeter()
	{	
	return 2*((double)pai * radius);
	} 
}   // end class Circle