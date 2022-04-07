import java.util.Scanner;
public class Simpletron
{
	private static int accumulator ;
	private static int instructionCounter ;
	private static int instructionRegister;
	private static int opCode ;
	private static int operend ;
	private static int [] memory ;
	
	private static final int READ = 10;
	private static final int WRITE = 11;
	private static final int LOAD = 20;
	private static final int STORE = 21;
    private static final int ADD = 30;	
    private static final int SUBTRACT = 31;	
    private static final int DIVIDE  = 32;
    private static final int MULTIPLY = 33;	
    private static final int BRANCH = 40;	
    private static final int BRANCHNEG = 41;	
	private static final int BRANCHZERO = 42;
	private static final int HALT = 43;
	
	public static void main(String[]args)
	
	{
		
		int [] memory = new int[100];
		instructionCounter = 0;
		instructionRegister = memory[instructionRegister];
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter Instructions:\n");
		
		
		
		for(int j  = 0; j<memory.length; ++j)
		{
			System.out.printf("%02d ? ",j);
			int input = sc.nextInt();
	
		if(input == -99999)
			break;
		memory[j] = input;
		}
		while(instructionCounter < memory.length){
		    	
		//instCode = sc.nextInt();
		instructionRegister = memory[instructionCounter];
		opCode = instructionRegister / 100;
		//System.out.println(opCode);
		operend = instructionRegister % 100;
		//System.out.println(operend);
	    
		instructionCounter++;
		}
		System.out.printf(" accumulator = %04d\n instructionCounter = %02d\ninstructionRegister = %04d\n opCode = %02d operend = %02d\n",accumulator,instructionCounter-1,instructionRegister,opCode,operend);
			System.out.printf ("\n%s\n", "The program has ended...");
		
		switch(opCode){
			case 10:
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Instruction Code");
				memory[operend] = input.nextInt();
			    System.out.println(memory[operend]);
				break;
            case 11:
				System.out.println("The result of the operation is " + memory[opCode]);			
			    break;
			case 20:
			    accumulator = memory[operend];
				break;
			case 21:
			    memory[operend] = accumulator;
				break;
			case 30:
			    accumulator += memory[operend];
				break;
			case 31:
			    accumulator -= memory[operend];
				break;
			case 32:
			    accumulator /= memory[operend];
				break;
			case 33:
			    accumulator *= memory[operend];
				break;
			case 40:
			    instructionCounter = operend;
				break;
			case 41:
			    if(accumulator < 0)
			       instructionCounter = operend;
				   break;
			case 42:
			    if(accumulator == 0)
			       instructionCounter = memory[operend];
				    break;
			case 43: 
			{
				// dumpTheCore ();	
				// System.out.printf(" accumulator = %04d\n instructionCounter = %02d\ninstructionRegister = %04d\n opCode = %02d operend = %02d\n",accumulator,instructionCounter,instructionRegister,opCode,operend);
				//displayMemory();
			System.out.printf ("\n%s\n", "The program has ended...");
			}
		}
	}
	public  void displayMemory ( ) //display Memory and welcome messege.
	{
		System.out.printf("Memory:%n%n");
		for ( int i = 0; i < 10; i++ )
		{
			System.out.printf ("\t  %d", i);
		}
		
		for( int counter = 0;  counter<memory.length; ++counter)// getting numbers
		{
			if(counter%10 == 0)
			System.out.printf("%n%2d",counter);
		System.out.printf("\t%s%04d","+",memory[counter]);
		}
	}
}
