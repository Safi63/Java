public class Inovice{
	private String partNumber;
	private String partDescription;
	private int purchasedItemQuntity;
	private double itemPrice;
	
	public Inovice(String partNumber, String partDescription, int purchasedItemQuntity, double iPrice)
	{
	this.partNumber= partNumber;
	this.partDescription = partDescription;
	this.purchasedItemQuntity = purchasedItemQuntity;
	this.itemPrice = itemPrice;
	}
	//using set method
	// public void setPartNumber(String partNumber) 
	// { 
	// this.partNumber = partNumber;
	// }  
	//using get method
	public String getPartNumber() 
	{ 
	 return partNumber;
	} 
	
	//using set method
	// public void setPartDescription (String partDescription) 
	// { 
	// this.partDescription = partDescription;
	// } 
	//using get method
	public String getPartDescription () 
	{ 
	return partDescription;
	} 
	
	//using set method
	// public void setPurchasedItemQuntity(int purchasedItemQuntity)
	// { 
	// this.purchasedItemQuntity = purchasedItemQuntity;
	// } 
	//using get method
	public int getPurchasedItemQuntity()
	{ 
	return purchasedItemQuntity;
	} 
	
	//using set method
	// public void setItemPrice(double itemPrice) 
	// { 
	// this.itemPrice = itemPrice;
	// } 
	//using get method
	public double getItemPrice() 
	{ 
	return itemPrice;
	} 
}