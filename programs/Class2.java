import java.util.Scanner;
public class Class2{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failuers = 0;
		int counter = 1;
		
		while(counter <= 10){
			System.out.print("Enter result (1 = pass , 2 = fail): ");
			int result = input.nextInt();
			
			if(result == 1)
				passes++;
				// passes = passes + 1;
			
			else if(result == 2)
				failuers++;
				// failuers = failuers + 1;
				
				counter++;
			// counter = counter + 1;
		}
		System.out.printf("Passes : %d%nFailuers : %d%n",passes,failuers);
		
		if(passes >= 8)
			System.out.println("Bouns to instructor");
		
	}
}
