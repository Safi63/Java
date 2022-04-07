 // Fig. 16.2: FruitCollection.java
 // Collection interface demonstrated via an ArrayList object.
 import java.util.List;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Iterator;

public class FruitCollection 
{
	public static void main(String[] args)
	{
	// add elements in fruits array to list
    String[] fruits = {"KINO", "MALTA", "KHARBOZA", "TARBOOZ"};
	List<String> fruitList = new ArrayList<String>();
	
	//add integer values 
	Integer[] weights = {10,10,10,10};
	List<Integer> weightList = new ArrayList<Integer>();
	
	for (String fruit : fruits)
		fruitList.add(fruit); // adds color to end of list
	
	for(Integer	weight : weights)
		weightList.add(weight);
	

	// add elements in removeColors array to removeList
	String[] removeFruits = {"KINO", "TARBOOZ"};
	List<String> removeList = new ArrayList<String>();
	
	for (String fruit : removeFruits)
		removeList.add(fruit);
	// output list contents
	System.out.println("ArrayList: ");

	for (int count = 0; count < fruitList.size() ; count++)
	System.out.printf("%s ", fruitList.get(count) );

	// remove from list the colors contained in removeList
	removeFruits(fruitList, removeList);

	// output list contents
	System.out.printf("%n%nArrayList after calling removeFruits:%n");
	
	for (int count = 0; count < removeList.size() ; count++)
	System.out.printf("%s ", removeList.get(count) );
	
	// for (String fruit : fruitList)
	// System.out.printf("%s ", fruit);
	
}

	// remove colors specified in collection2 from collection1
	private static void removeFruits(Collection<String> collection1,Collection<String> collectoin2)
	{
	// get iterator
	Iterator<String> iterator = collection1.iterator();
 

	// loop while collection has items
	while (iterator.hasNext()) 
	{
		if(collection1.contains(iterator.next()))
			iterator.remove();
		}
	} 
} // end class CollectionTest