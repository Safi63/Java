/* Malta.java

public class Malta extends Citrus
{
	private double vitamenC; 
	private double  weight; 

	// constructor
	public Malta(double vitamenC, double weight)
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
	
	// public void setWeight(double weight)
	// {
	// this.weight = weight;
	// } 

	// public double getWeight()
	// {
	// return weight;
	// } 
	
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
}   // end class Malta */

public class Malta extends Citrus{
	
	public Malta(double weight, double vitCAmount){
		super(weight, vitCAmount);
	}
	
	public String toString(){
		return String.format("Malta%n\tWeight %s%n",  super.toString());
	}
	
}