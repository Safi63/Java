/* Test application for Fruit hierarchy 

public class FruitTest {

    public static void main(String[] args) {
        
        // create subclass objects
        Kino kino = new Kino(5,4);
        Malta malta = new Malta(5,4);
        Kharboza kharboza = new Kharboza(3, 6);
        Tarboz tarboz = new Tarboz(4,4);
        
        // create Fruit array
        Fruit[] fruit = new Fruit[4];
   
        // initialize array
        fruit[0] = kino;
        fruit[1] = malta;
        fruit[2] = kharboza;
        fruit[3] = tarboz;
       
        
        for(Fruit currentFruit: fruit)
        {
            System.out.println(currentFruit);
            
            if (currentFruit instanceof Melon)
            {
                // Melon melon = (Melon) currentFruit;
                
                System.out.printf("%s: %.2f%n%n%s: %.2f%n%n", "AntiOccidents", currentFruit.getAo(),"Weight", currentFruit.getWeight());
            }
            
            else if (currentFruit instanceof Citrus)
                System.out.printf("%s: %.2f%n%n:%s.2f%n%n", "VitamenC", currentFruit.getVitamenC(),"Weight",currentFruit.getWeight());
        } // end for loop
    } // end method main
} // end class FruitTest */

public class FruitTest{
	
	public static void main(String[] args){
		
		double totalWeight = 0;
		double totalVCAmount = 0;
		double totalAntiOxidentAmount = 0; 
		
		Fruit[] Fruits = new Fruit[4];	
		Fruits[0] = new Kino(13,35);
		Fruits[1] = new Malta(23,54); 
		Fruits[2] = new Kharboza(23,45);
		Fruits[3] = new Tarboz(13,27);
	
		System.out.printf("Fruits are follwing:%n%n");
		
			
		 for (Fruit currentFruit : Fruits){
			System.out.println(currentFruit);
			totalWeight += currentFruit.getWeight();
			
			if(currentFruit instanceof Citrus){
				Citrus vit = (Citrus)currentFruit;
				totalVCAmount += vit.getVCAmount();
			}
		
			if(currentFruit instanceof Melon){
				Melon meln = (Melon)currentFruit;
				totalAntiOxidentAmount += meln.getAntiOAmount();
			}
			
		}
		
		System.out.println("Total Weight: " + totalWeight);
		System.out.println("Total Vitamins: " + totalVCAmount);
		System.out.println("Total Antioxide: " + totalAntiOxidentAmount);
		
	}   
}