 // Fig. 20.9: StackTest.java
 // Stack generic class test program.

public class StackTest 
{
	public static void main(String[] args) 
	{
		Fruit[] fruitElements = {};
		
		// Create a Stack<Fruit>
		Stack<Fruit> fruitStack = new Stack<>(5); 
 
		// push elements of fruitElements onto FruitStack
		testPushFruit(fruitStack, fruitElements); 
		testPopFruit(fruitStack); // pop from fruitStack
		
		// test push method with fruit stack
	}
		private static void testPushFruit(
		Stack<Fruit> stack, Fruit[] values)
		{
			System.out.printf("%nPushing elements onto doubleStack%n");

			// push elements to Stack
			for (Fruit value : values)
			{
			System.out.printf("%s ", value);
 
			}
		}

	// test pop method with double stack
	private static void testPopFruit(Stack<Fruit> stack)
	{
		// pop elements from stack
		try
		{
			System.out.printf("%nPopping elements from FruitStack%n");
			Fruit popValue; // store element removed from stack

			// remove all elements from Stack
			while (true)
			{
				System.out.printf("%s ", popValue); 
			} 
		}
		catch(EmptyStackException emptyStackException)
		{
			System.err.println();
			emptyStackException.printStackTrace();
		} 
	}
}