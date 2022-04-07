import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class FruitCollection{
		
	public static void main(String[] args){
		
		double totalWeight = 0;
		double totalVCAmount = 0;
		double totalAntiOxidentAmount = 0; 
		
		ArrayList<Fruit> arraylist = new ArrayList<Fruit>();
		arraylist.add(new Kino(3, 13));
		arraylist.add(new Malta(2, 11));
		arraylist.add(new Kharboza(4, 15));
		arraylist.add(new Tarboz(3, 17));
		
		System.out.printf("Fruits are follwing:%n%n");
		
			
		 for (Fruit currentFruit : arraylist){
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
		
		System.out.println("Total Weight: " + totalWeight + " Kg");
		System.out.println("Total Vitamins: " + totalVCAmount + " Grams");
		System.out.println("Total Antioxide: " + totalAntiOxidentAmount + " Grams");
		
	}   
}