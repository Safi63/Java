import java.security.SecureRandom;
public class DeckOfCardsModified{
	private Card[] deck;
	private int currentCard;//index of next card(0-51)
	private static final int NUMBER_OF_CARDS = 52;
	//Rendom number generator
	private static final SecureRandom randomNumbers=new SecureRandom();
	//constracter fill of deck of card
	public void DeckOfCards(){
		String[] face={"Ace","Deuce","Three","Four","five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suit={"Hearts","Dimonds","Clubs","Spades"};
		deck=new Card[NUMBER_OF_CARDS];
		currentCard=0;
		//populate deck with Card object
		for(int count=0; count<deck.length; count++){
			deck[count]=new Card(face[count%13],suit[count/13]);
		}
	}
	//Shuffle deck of card with one pass
	public void shuffle(){
		//next call to methode dealcard should start at deck[0]again
		currentCard=0;
		for(int first=0; first<deck.length;first++){
			//select randomNumbers from 0-51
			int second=randomNumbers.nextInt(NUMBER_OF_CARDS);
			//swap current card with Random
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] =  temp;
		}
	}
	//deal of one CardLayout
	public Card dealCard(){
		//determine whether Cards remain to be dealt
		if(currentCard<deck.length)
			return deck[currentCard++];
		else
			return null;//indicate that all card were dealt
	}
	switch(currentCard)
	{
	case 1:
	if(deck[currentCard+1]="Ace" && deck[currentCard+2]="Deuce"){
		System.out.println("true");
	break;
	}
	case 2:
	if(deck[currentCard+1]="Deuce" && deck[currentCard+2]="Three")
		System.out.println("true");
	break;
	case 3:
	if(deck[currentCard+1]="Three" && deck[currentCard+2]="Four")
		System.out.println("true");
	break;
	case 4:
	if(deck[currentCard+1]="Four" && deck[currentCard+2]="Five")
		System.out.println("true");
	break;
	case 5:
	if(deck[currentCard+1]="Five" && deck[currentCard+2]="Six")
		System.out.println("true");
	break;
	case 6:
	if(deck[currentCard+1]="Six" && deck[currentCard+2]="Seven")
		System.out.println("true");
	break;
	case 7:
	if(deck[currentCard+1]="Seven" && deck[currentCard+2]="Eight")
		System.out.println("true");
	break;
	case 8:
	if(deck[currentCard+1]="Eight" && deck[currentCard+2]="Nine")
		System.out.println("true");
	break;
	case 9:
	if(deck[currentCard+1]="Nine" && deck[currentCard+2]="Ten")
		System.out.println("true");
	break;
	case 10:
	if(deck[currentCard+1]="Ten" && deck[currentCard+2]="Jack")
		System.out.println("true");
	break;
	case 11:
	if(deck[currentCard+1]="Jack" && deck[currentCard+2]="Queen")
		System.out.println("true");
	break;
	case 12:
	if(deck[currentCard+1]="Queen" && deck[currentCard+2]="King")
		System.out.println("true");
	break;
	}
}//end class DeckOfCardsModified