/*  Kino.java

public class Kino extends Citrus
{
	private double vitamenC; 
	private double  weight; 

	// constructor
	public Kino(double vitamenC, double weight)
	{
	super();
	this.vitamenC = vitamenC;
	this.weight = weight;
	} 

	public void setVc(double vitamenC)
	{
	this.vitamenC = vitamenC;
	} 

	public double getVc()
	{
	return vitamenC;
	} 

	
	@Override 
	public double getVitamenC()
	{
	return vitamenC;
	}
	
	@Override 
	public double getWeight()
	{
	return weight;
	}
}   // end class Kino
*/

public class Kino extends Citrus{
	
	
	public Kino(double weight, double vitCAmount){
		super(weight, vitCAmount);
		
	}
	
	public String toString(){
		return String.format("Kinu%n\tWeight %s%n", super.toString());
		
	// return String.format("Circle%n\tArea %.2f%n\tParameter %.2f",  getweight(), getVitCAmount());

	}
}