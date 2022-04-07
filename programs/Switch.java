import java.util.Scanner;
public class Switch{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Push the button: ");
		int button = input.nextInt();
		switch(button){
			case 1 : System.out.println("Yes");
			break;
			case 2 :  System.out.println("No");
			break;
			default : System.out.println("Invalid button");
		}
	}
}