public class Circle
{
	private double radius;
	private double area;
	private double circum;
	private double pi= 3.14;
	private average;
	
	
	
	//constructor
	public Circle(double radius)
	{
		this.radius = radius;	
	}
	
	// setter
	public void setRadius(double radius)
	{ 
		this.radius = radius;
	}
	
	// getters
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return area = pi*(radius*radius);
	}
	
	public double getCircum()
	{
		return circum = 2.0*(pi*radius);
	}
	
	public double getAreaAverage(int[] setOfArea)
	{
		int total = 0;
		
		for(int tArea : setOfArea)
			total += tArea;
		
		return(double)total/setOfArea.length;
	}
	
	public double getCircumAverage(int[] setOfCircum)
	{
		int total = 0;
		
		for(int tCircum : setOfCircum)
			total += tCircum;
		
		return(double)total/setOfCircum.length;
	}
}