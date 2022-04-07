import java.security.SecureRandom;
//modification of public class Craps
public class Assignment1
{
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status {CONTINUE, WON, LOST};
	
	//constants that represent common rolls of the dice 
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	private static int playerWin1stStroke;
	private static int casinoWin1stStroke;
	private static int playerWin;
	private static int casinoWin;
	
	public static void main(String[]args){
		
		int playerAmount = 0;
		int casinoAmount = 0;
		//tally counts for 10000 rolls 
		for(int roll = 1; roll<=10000; roll++){
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		switch (sumOfDice)
		{
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
				playerWin1stStroke++;
				playerAmount+= 50;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
				casinoWin1stStroke++;
				casinoAmount += 50;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				// System.out.printf("Point is %d%n",myPoint);
				break;
		}
		
		//while game is not complete
		while (gameStatus == Status.CONTINUE)//not WON or LOST
		{
			sumOfDice = rollDice();//roll dice again
			
			if(sumOfDice == myPoint){
				gameStatus = Status.WON;
				playerWin++;
				playerAmount+= 50;
			}else{
				
			if(sumOfDice == SEVEN){
				gameStatus = Status.LOST;
				casinoWin++;
				casinoAmount+= 50;
				}
			}
		}
	}
		// if (gameStatus == Status.WON)
			// System.out.printf("Player wins%n%n");
		// else
			// System.out.printf("Player loses%n%n");
		
		int totalPlayerWin = playerWin + playerWin1stStroke;
		int totalCasionWin = casinoWin + casinoWin1stStroke;
		
		System.out.printf("%nDetails...%n");
		System.out.printf("Player wins with First strike:%d%n",playerWin1stStroke);
		System.out.printf("Player wins with point:%d%n",playerWin);
		System.out.printf("Casino wins with First strike:%d%n",casinoWin1stStroke);
		System.out.printf("Casino wins with SEVEN:%d%n%n",casinoWin);
		
		//Totals
		System.out.printf("Totals...%nPlayer wins total:%d%n",totalPlayerWin);
		System.out.printf("Casino wins total:%d%n",totalCasionWin);
		System.out.printf("Winnig Amount of Player:%d%n",playerAmount);
		System.out.printf("Winnig Amount of casion:%d",casinoAmount);
		
		
	}
	
	public static int rollDice()
	{
		// pick random die values

		int die1 = 1 + randomNumbers.nextInt(6);//first roll die
		int die2 = 1 + randomNumbers.nextInt(6);//second roll die1
		
		int sum = die1 + die2;
		
		//display results of this roll
		// System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
	
		return sum;
	}
}//end class Craps