// Fig. 21.5
import com.deitel.datastructures.List;
import com.deitel.datastructures.EmptyListException;
public class ListTest{
	
	public static void main(String[]args)
	{
		List<Integer> list = new List<>();
		
		list.insertAtFront(-1);
		list.print();
		list.insertAtFront(0);
		list.print();
		list.insertAtBack(1);
		list.print();
		list.insertAtBack(5);
		list.print();
		
		try
		{
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			int removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			int removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
		}
		catch (EmptyListException emptyListException)
		{
			emptyListException.printStackTrace();
		}
	}
}