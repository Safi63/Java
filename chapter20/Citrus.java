// public abstract class Citrus extends Fruit
// {
	// public abstract double getVitamenC();
// } end class Citrus

public abstract class Citrus extends Fruit{
	
	private double vitCAmount;
	 
	public Citrus(double weight, double vitCAmount){
		super(weight);
		this.vitCAmount = vitCAmount;
	}
	 
	public double getVCAmount (){
		 return vitCAmount;
	}
	 
	@Override
	public String toString(){
		return String.format("Vitaman C %s %.2f", super.toString(), getVCAmount());
		
	}
}