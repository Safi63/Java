//  Rectangle.java

public class Rectangle extends Shape2d
{
	private int length;
	private int wirth;

	// constructor
	public Rectangle(int area, int peremeter, int length, int wirth)
	{
		super(area, peremeter); 
		this.length = length;
		this.wirth = wirth;
	}

	public void setLength(int length)
	{
	 this.length = length;
	} 

	public int getLength()
	{
	 return length;
	}
	
	public void setWirth(int wirth)
	{
	 this.wirth = wirth;
	} 

	public int getWirth()
	{
	 return wirth;
	}
	
	@Override 
	public double area()
	{
	return length * wirth;
	}
	
	public double peremeter()
	{
	return 2 * (length + wirth);
	} 
}  // end class Rectangle