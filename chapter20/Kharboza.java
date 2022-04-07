/*  Kharboza.java

public class Kharboza extends Melon
{
	private double antiOc; 
	private double  weight; 

	// constructor
	public Kharboza(double antiOc, double weight)
	{
	super();
	this.antiOc = antiOc;
	this.weight = weight;
	} 

	public void setAntiOc(double antiOc)
	{
	this.antiOc = antiOc;
	} 

	public double getAntiOc()
	{
	return antiOc;
	} 
	
	// public void setWeight(double weight)
	// {
	// this.weight = weight;
	// } 

	// public double getWeight()
	// {
	// return weight;
	// } 
	
	@Override 
	public double getAo()
	{
	return antiOc;
	}
	
	@Override 
	public double getWeight()
	{
	return weight;
	}
}   // end class Kharboza */

public class Kharboza extends Melon{
	
	public Kharboza(double weight, double antiOxidentAmount){
		super(weight, antiOxidentAmount);
	}
	
	public String toString(){
		return String.format("Kharbooz%n\tWeight %s%n",  super.toString());
	}
}