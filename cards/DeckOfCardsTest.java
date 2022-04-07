//Fig.7.11: DeckOfCardTest.java
//Card shuffling and dealing.
public class DeckOfCardsTest
{
	//execute application
	public static void main(String[] args)
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();//place Cards in random order
		myDeckOfCards.DeckOfCards();
		//print all Cards in the order in which they are dealt 
		for(int i = 1 ; i<= 52; i++)
		{
			//deal and display a Card
			System.out.printf("%-19s",myDeckOfCards.dealCard());
			if(i%4 == 0)// output a newline after every fourth card
			System.out.println();
		}myDeckOfCards.DeckOfCards();
		if(faces[i] == faces[i] && faces[i+1] == faces[i+1] && faces[i+2] == faces[i+2])
			System.out.println("safi");
	}
}//End class DeckOfCardsTest